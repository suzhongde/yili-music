package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.FileDto;
import com.suzhongde.yilimusic.dto.FileUploadRequest;
import com.suzhongde.yilimusic.entity.File;
import com.suzhongde.yilimusic.vo.FileVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FileMapper {
    File createEntity(FileUploadRequest fileUploadRequest);

    FileVo toVo(FileDto fileDto);

    FileDto toDto(File file);
}
