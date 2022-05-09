package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.AlbumCreateRequest;
import com.suzhongde.yilimusic.dto.AlbumDto;
import com.suzhongde.yilimusic.entity.Album;
import com.suzhongde.yilimusic.vo.AlbumVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        uses = {FileMapper.class, ArtistMapper.class, MusicMapper.class},
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface AlbumMapper extends MapperInterface<Album, AlbumDto> {

    @Mapping(source = "coverId", target = "cover.id")
    @Mapping(source = "artistIds", target = "artists")
    AlbumDto toDto(AlbumCreateRequest albumCreateRequest);

    AlbumVo toVo(AlbumDto albumDto);
}