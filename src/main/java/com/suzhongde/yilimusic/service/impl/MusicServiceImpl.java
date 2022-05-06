package com.suzhongde.yilimusic.service.impl;

import com.suzhongde.yilimusic.dto.MusicDto;
import com.suzhongde.yilimusic.entity.Music;
import com.suzhongde.yilimusic.enums.MusicStatus;
import com.suzhongde.yilimusic.exception.ExceptionType;
import com.suzhongde.yilimusic.mapper.MapperInterface;
import com.suzhongde.yilimusic.mapper.MusicMapper;
import com.suzhongde.yilimusic.repository.MusicRepository;
import com.suzhongde.yilimusic.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl extends GeneralServiceImpl<Music, MusicDto> implements MusicService {

    private MusicRepository repository;

    private MusicMapper mapper;

    @Override
    public MusicDto create(MusicDto musicDto) {
        return super.create(musicDto);
    }

    @Override
    public void publish(String id) {
        Music music = getEntity(id);
        music.setStatus(MusicStatus.PUBLISHED);
        repository.save(music);
    }


    @Override
    public void close(String id) {
        Music music = getEntity(id);
        music.setStatus(MusicStatus.CLOSED);
        repository.save(music);
    }


    @Autowired
    public void setRepository(MusicRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setMapper(MusicMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public JpaRepository<Music, String> getRepository() {
        return repository;
    }

    @Override
    public MapperInterface<Music, MusicDto> getMapper() {
        return mapper;
    }

    @Override
    public ExceptionType getNotFoundExceptionType() {
        return ExceptionType.MUSIC_NOT_FOUND;
    }

    @Override
    public Page<MusicDto> search(MusicDto searchDto, Pageable pageable) {
        return null;
    }
}
