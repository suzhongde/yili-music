package com.suzhongde.yilimusic.service.impl;

import com.suzhongde.yilimusic.dto.AlbumDto;
import com.suzhongde.yilimusic.entity.Album;
import com.suzhongde.yilimusic.exception.ExceptionType;
import com.suzhongde.yilimusic.mapper.AlbumMapper;
import com.suzhongde.yilimusic.mapper.MapperInterface;
import com.suzhongde.yilimusic.repository.AlbumRepository;
import com.suzhongde.yilimusic.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl extends TraceableGeneralServiceImpl<Album, AlbumDto> implements AlbumService {

    private AlbumRepository repository;

    private AlbumMapper mapper;


    @Autowired
    public void setRepository(AlbumRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setMapper(AlbumMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public JpaRepository<Album, String> getRepository() {
        return repository;
    }

    @Override
    public MapperInterface<Album, AlbumDto> getMapper() {
        return mapper;
    }

    @Override
    public ExceptionType getNotFoundExceptionType() {
        return ExceptionType.ALBUM_NOT_FOUND;
    }
}