package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.FileUploadRequest;
import com.suzhongde.yilimusic.entity.File;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FileMapper {
    File createEntity(FileUploadRequest fileUploadRequest);
}
