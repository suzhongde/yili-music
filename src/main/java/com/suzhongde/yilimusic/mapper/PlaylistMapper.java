package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.PlaylistDto;
import com.suzhongde.yilimusic.entity.Playlist;
import com.suzhongde.yilimusic.vo.PlaylistVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlaylistMapper {
    PlaylistDto toDto(Playlist playlist);

    PlaylistVo toVo(PlaylistDto playlistDto);
}