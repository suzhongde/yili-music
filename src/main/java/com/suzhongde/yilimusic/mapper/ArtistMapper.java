package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.ArtistCreateRequest;
import com.suzhongde.yilimusic.dto.ArtistDto;
import com.suzhongde.yilimusic.dto.ArtistUpdateRequest;
import com.suzhongde.yilimusic.entity.Artist;
import com.suzhongde.yilimusic.vo.ArtistVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {FileMapper.class, MusicMapper.class})
public interface ArtistMapper {

    @Mapping(source = "photoId", target = "photo.id")
    Artist createEntity(ArtistCreateRequest artistCreateRequest);

    @Mapping(source = "photoId", target = "photo.id")
    Artist updateEntity(@MappingTarget Artist artist, ArtistUpdateRequest artistUpdateRequest);

    ArtistDto toDto(Artist artist);

    ArtistVo toVo(ArtistDto artistDto);
}