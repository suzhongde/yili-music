package com.suzhongde.yilimusic.controller;

import com.suzhongde.yilimusic.dto.FileUploadRequest;
import com.suzhongde.yilimusic.mapper.FileMapper;
import com.suzhongde.yilimusic.mapper.FileUploadMapper;
import com.suzhongde.yilimusic.service.FileService;
import com.suzhongde.yilimusic.vo.FileUploadVo;
import com.suzhongde.yilimusic.vo.FileVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@PreAuthorize("hasRole('ROLE_ADMIN')")
@RestController
@RequestMapping("/files")
public class FileController {

    private FileService fileService;

    private FileMapper fileMapper;

    private FileUploadMapper fileUploadMapper;

    @PostMapping("/upload_init")
    public FileUploadVo initUpload(@Validated @RequestBody FileUploadRequest fileUploadRequest) throws IOException {
        return fileUploadMapper.toVo(fileService.initUpload(fileUploadRequest));
    }

    @PostMapping("/{id}/upload_finish")
    public FileVo finishUpload(@PathVariable String id) {
        return fileMapper.toVo(fileService.finishUpload(id));
    }


    @Autowired
    public void setFileService(FileService fileService) {
        this.fileService = fileService;
    }

    @Autowired
    public void setFileMapper(FileMapper fileMapper) {
        this.fileMapper = fileMapper;
    }


    @Autowired
    public void setFileUploadMapper(FileUploadMapper fileUploadMapper) {
        this.fileUploadMapper = fileUploadMapper;
    }
}
