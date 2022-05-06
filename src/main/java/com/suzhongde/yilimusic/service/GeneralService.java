package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.BaseDto;
import com.suzhongde.yilimusic.entity.BaseEntity;
import com.suzhongde.yilimusic.exception.ExceptionType;
import com.suzhongde.yilimusic.mapper.MapperInterface;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralService<Entity extends BaseEntity, Dto extends BaseDto> {
    JpaRepository<Entity, String> getRepository();

    MapperInterface<Entity, Dto> getMapper();

    ExceptionType getNotFoundExceptionType();

    Dto create(Dto dto);

    Dto get(String id);

    Dto update(String id, Dto dto);

    void delete(String id);

    Page<Dto> search(Dto searchDto, Pageable pageable);
}