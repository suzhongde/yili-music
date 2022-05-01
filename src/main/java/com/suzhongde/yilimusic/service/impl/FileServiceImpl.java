package com.suzhongde.yilimusic.service.impl;

import com.suzhongde.yilimusic.dto.FileUploadDto;
import com.suzhongde.yilimusic.dto.FileUploadRequest;
import com.suzhongde.yilimusic.entity.File;
import com.suzhongde.yilimusic.enums.Storage;
import com.suzhongde.yilimusic.mapper.FileMapper;
import com.suzhongde.yilimusic.repository.FileRepository;
import com.suzhongde.yilimusic.service.FileService;
import com.suzhongde.yilimusic.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
public class FileServiceImpl implements FileService {

    private Map<String, StorageService> storageServices;

    private FileRepository repository;

    private FileMapper mapper;

    @Override
    @Transactional
    public FileUploadDto initUpload(FileUploadRequest fileUploadRequest) {
        // 创建File实体
        File file = repository.save(mapper.createEntity(fileUploadRequest));

        // 通过接口获取STS令牌
        FileUploadDto fileUploadDto = storageServices.get(getDefaultStorage().name()).initFileUpload();

        fileUploadDto.setKey(file.getKey());
        return fileUploadDto;
    }


    // Todo: 后台设置当前Storage
    private Storage getDefaultStorage() {
        return Storage.COS;
    }


    @Autowired
    public void setStorageServices(Map<String, StorageService> storageServices) {
        this.storageServices = storageServices;
    }

    @Autowired
    public void setRepository(FileRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setMapper(FileMapper mapper) {
        this.mapper = mapper;
    }
}
