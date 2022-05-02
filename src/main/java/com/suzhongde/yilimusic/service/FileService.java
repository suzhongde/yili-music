package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.FileDto;
import com.suzhongde.yilimusic.dto.FileUploadDto;
import com.suzhongde.yilimusic.dto.FileUploadRequest;
import com.suzhongde.yilimusic.enums.Storage;

import java.io.IOException;

public interface FileService {
    FileUploadDto initUpload(FileUploadRequest fileUploadRequest) throws IOException;

    FileDto finishUpload(String id);

    Storage getDefaultStorage();
}
