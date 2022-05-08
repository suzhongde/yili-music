package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.ArtistCreateRequest;
import com.suzhongde.yilimusic.dto.ArtistDto;
import com.suzhongde.yilimusic.dto.ArtistUpdateRequest;
import com.suzhongde.yilimusic.entity.Artist;
import com.suzhongde.yilimusic.vo.ArtistVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {FileMapper.class, MusicMapper.class})
public interface ArtistMapper extends MapperInterface<Artist, ArtistDto> {

    @Mapping(source = "photoId", target = "photo.id")
    ArtistDto toDto(ArtistCreateRequest artistCreateRequest);

    ArtistDto toDto(ArtistUpdateRequest artistUpdateRequest);

    ArtistVo toVo(ArtistDto artistDto);
}