package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.MusicCreateRequest;
import com.suzhongde.yilimusic.dto.MusicDto;
import com.suzhongde.yilimusic.dto.MusicUpdateRequest;

import java.util.List;

public interface MusicService {
    MusicDto create(MusicCreateRequest musicCreateRequest);

    MusicDto update(String id, MusicUpdateRequest musicUpdateRequest);

    List<MusicDto> list();

    void publish(String id);

    void close(String id);
}
