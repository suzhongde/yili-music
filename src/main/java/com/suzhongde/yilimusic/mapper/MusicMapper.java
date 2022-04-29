package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.MusicCreateRequest;
import com.suzhongde.yilimusic.dto.MusicDto;
import com.suzhongde.yilimusic.dto.MusicUpdateRequest;
import com.suzhongde.yilimusic.entity.Music;
import com.suzhongde.yilimusic.vo.MusicVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface MusicMapper {
    MusicDto toDto(Music music);

    MusicVo toVo(MusicDto musicDto);

    Music createEntity(MusicCreateRequest musicCreateRequest);

    Music updateEntity(@MappingTarget Music music, MusicUpdateRequest musicUpdateRequest);
}
