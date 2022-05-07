package com.suzhongde.yilimusic.controller;

import com.suzhongde.yilimusic.dto.ArtistCreateRequest;
import com.suzhongde.yilimusic.dto.ArtistSearchFilter;
import com.suzhongde.yilimusic.dto.ArtistUpdateRequest;
import com.suzhongde.yilimusic.mapper.ArtistMapper;
import com.suzhongde.yilimusic.service.ArtistService;
import com.suzhongde.yilimusic.vo.ArtistVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    ArtistService artistService;

    ArtistMapper artistMapper;

    @PostMapping
    public ArtistVo create(@Validated @RequestBody ArtistCreateRequest artistCreateRequest) {
        return artistMapper.toVo(artistService.create(artistMapper.toDto(artistCreateRequest)));
    }

    @PostMapping("/{id}")
    public ArtistVo update(@PathVariable String id, @Validated @RequestBody ArtistUpdateRequest artistUpdateRequest) {
        return artistMapper.toVo(artistService.update(id, artistMapper.toDto(artistUpdateRequest)));
    }

    @GetMapping
    public List<ArtistVo> list() {
        return artistService.list().stream().map(artistMapper::toVo).collect(Collectors.toList());
    }

    @PostMapping("/search")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Page<ArtistVo> search(@Validated @RequestBody(required = false) ArtistSearchFilter filter) {
        if (filter == null) {
            filter = new ArtistSearchFilter();
        }
        return artistService.search(filter).map(artistMapper::toVo);
    }

    @Autowired
    public void setArtistService(ArtistService artistService) {
        this.artistService = artistService;
    }

    @Autowired
    public void setArtistMapper(ArtistMapper artistMapper) {
        this.artistMapper = artistMapper;
    }
}