package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.PlaylistDto;
import com.suzhongde.yilimusic.dto.PlaylistSearchFilter;
import com.suzhongde.yilimusic.entity.Playlist;
import org.springframework.data.domain.Page;

public interface PlaylistService extends GeneralService<Playlist, PlaylistDto> {
    Page<PlaylistDto> search(PlaylistSearchFilter playlistSearchFilter);

    PlaylistDto recommend(String id, Integer recommendFactor);

    PlaylistDto cancelRecommendation(String id);

    PlaylistDto makeSpecial(String id);

    PlaylistDto cancelSpecial(String id);
}