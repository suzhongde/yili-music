package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.FileUploadDto;
import com.suzhongde.yilimusic.dto.FileUploadRequest;

public interface FileService {

    FileUploadDto initUpload(FileUploadRequest fileUploadRequest);
}
