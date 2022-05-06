package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.BaseDto;
import com.suzhongde.yilimusic.entity.BaseEntity;
import org.mapstruct.MappingTarget;

public interface MapperInterface<Entity extends BaseEntity, Dto extends BaseDto> {
    Dto toDto(Entity entity);

    Entity toEntity(Dto dto);

    Entity updateEntity(@MappingTarget Entity entity, Dto dto);
}