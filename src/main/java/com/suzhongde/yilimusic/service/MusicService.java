package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.MusicDto;
import com.suzhongde.yilimusic.entity.Music;

public interface MusicService extends GeneralService<Music, MusicDto> {

    void publish(String id);

    void close(String id);
}
