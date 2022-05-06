package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.MusicDto;
import com.suzhongde.yilimusic.dto.MusicSearchFilter;
import com.suzhongde.yilimusic.entity.Music;
import org.springframework.data.domain.Page;

public interface MusicService extends GeneralService<Music, MusicDto> {
    
    Page<MusicDto> search(MusicSearchFilter musicSearchRequest);

    void publish(String id);

    void close(String id);
}
