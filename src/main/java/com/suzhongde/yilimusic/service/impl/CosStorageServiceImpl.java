package com.suzhongde.yilimusic.service.impl;

import com.suzhongde.yilimusic.dto.FileUploadDto;
import com.suzhongde.yilimusic.service.StorageService;
import org.springframework.stereotype.Service;

@Service("COS")
public class CosStorageServiceImpl implements StorageService {
    @Override
    public FileUploadDto initFileUpload() {
        return null;
    }
}
