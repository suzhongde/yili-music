package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.FileUploadDto;

import java.io.IOException;

public interface StorageService {
    FileUploadDto initFileUpload() throws IOException;
}
