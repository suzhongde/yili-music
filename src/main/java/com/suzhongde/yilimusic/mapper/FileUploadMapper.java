package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.FileUploadDto;
import com.suzhongde.yilimusic.vo.FileUploadVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FileUploadMapper {
    FileUploadVo toVo(FileUploadDto fileUploadDto);
}
