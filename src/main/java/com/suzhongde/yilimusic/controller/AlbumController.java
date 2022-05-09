package com.suzhongde.yilimusic.controller;

import com.suzhongde.yilimusic.dto.AlbumCreateRequest;
import com.suzhongde.yilimusic.mapper.AlbumMapper;
import com.suzhongde.yilimusic.service.AlbumService;
import com.suzhongde.yilimusic.vo.AlbumVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private AlbumService albumService;

    private AlbumMapper albumMapper;

    @PostMapping
    public AlbumVo create(@Validated @RequestBody AlbumCreateRequest albumCreateRequest) {
        return albumMapper.toVo(albumService.create(albumMapper.toDto(albumCreateRequest)));
    }


    @Autowired
    public void setAlbumMapper(AlbumMapper albumMapper) {
        this.albumMapper = albumMapper;
    }

    @Autowired
    public void setAlbumService(AlbumService albumService) {
        this.albumService = albumService;
    }
}