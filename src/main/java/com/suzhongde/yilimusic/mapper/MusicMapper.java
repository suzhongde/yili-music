package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.MusicCreateRequest;
import com.suzhongde.yilimusic.dto.MusicDto;
import com.suzhongde.yilimusic.dto.MusicUpdateRequest;
import com.suzhongde.yilimusic.entity.Music;
import com.suzhongde.yilimusic.vo.MusicVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = FileMapper.class)
public interface MusicMapper extends MapperInterface<Music, MusicDto> {
    MusicDto toDto(MusicCreateRequest musicCreateRequest);

    MusicDto toDto(MusicUpdateRequest musicUpdateRequest);

    MusicVo toVo(MusicDto musicDto);
}
