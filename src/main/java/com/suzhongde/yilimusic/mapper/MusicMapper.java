package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.ArtistDto;
import com.suzhongde.yilimusic.dto.MusicCreateRequest;
import com.suzhongde.yilimusic.dto.MusicDto;
import com.suzhongde.yilimusic.dto.MusicUpdateRequest;
import com.suzhongde.yilimusic.entity.Music;
import com.suzhongde.yilimusic.vo.MusicVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring",
        uses = {FileMapper.class},
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface MusicMapper extends MapperInterface<Music, MusicDto> {
    @Mapping(source = "fileId", target = "file.id")
    @Mapping(target = "artistList", source = "artistIds")
    MusicDto toDto(MusicCreateRequest musicCreateRequest);

    @Mapping(source = "fileId", target = "file.id")
    @Mapping(target = "artistList", source = "artistIds")
    MusicDto toDto(MusicUpdateRequest musicUpdateRequest);

    MusicVo toVo(MusicDto musicDto);


    default List<ArtistDto> mapArtistList(List<String> artistIds) {
        List<ArtistDto> artistList = new ArrayList<ArtistDto>();
        for (String id : artistIds) {
            ArtistDto artistDto = new ArtistDto();
            artistDto.setId(id);
            artistList.add(artistDto);
        }
        return artistList;
    }
}
