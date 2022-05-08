package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.PlaylistCreateRequest;
import com.suzhongde.yilimusic.dto.PlaylistDto;
import com.suzhongde.yilimusic.entity.Playlist;
import com.suzhongde.yilimusic.vo.PlaylistVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {FileMapper.class}, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PlaylistMapper extends MapperInterface<Playlist, PlaylistDto> {

    @Mapping(source = "coverId", target = "cover.id")
    PlaylistDto toDto(PlaylistCreateRequest playlistCreateRequest);

    PlaylistVo toVo(PlaylistDto playlistDto);
}