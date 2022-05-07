package com.suzhongde.yilimusic.service;


import com.suzhongde.yilimusic.dto.ArtistDto;
import com.suzhongde.yilimusic.dto.ArtistSearchFilter;
import com.suzhongde.yilimusic.entity.Artist;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArtistService extends GeneralService<Artist, ArtistDto> {

    List<ArtistDto> list();

    Page<ArtistDto> search(ArtistSearchFilter artistSearchFilter);
}