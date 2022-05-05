package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.FileDto;
import com.suzhongde.yilimusic.entity.File;
import com.suzhongde.yilimusic.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

public abstract class FileMapperDecorator implements FileMapper {

    @Autowired
    @Qualifier("delegate")
    private FileMapper delegate;

    @Autowired
    private Map<String, StorageService> storageServices;

    @Override
    public FileDto toDto(File file) {
        FileDto fileDto = delegate.toDto(file);

        if (fileDto == null) {
            return null;
        }

        fileDto.setUri(storageServices.get(fileDto.getStorage().name()).getFileUri(fileDto.getKey()));
        return fileDto;
    }
}