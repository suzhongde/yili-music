package com.suzhongde.yilimusic.service.impl;

import com.suzhongde.yilimusic.dto.BaseDto;
import com.suzhongde.yilimusic.entity.BaseEntity;
import com.suzhongde.yilimusic.exception.BizException;
import com.suzhongde.yilimusic.service.GeneralService;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public abstract class GeneralServiceImpl<Entity extends BaseEntity, Dto extends BaseDto> extends BaseService implements GeneralService<Entity, Dto> {

    @Override
    public Dto create(Dto dto) {
        Entity entity = getMapper().toEntity(dto);
        return getMapper().toDto(getRepository().save(entity));
    }

    @Override
    public Dto get(String id) {
        return getMapper().toDto(getEntity(id));
    }

    protected Entity getEntity(String id) {
        Optional<Entity> optionalEntity = getRepository().findById(id);
        if (!optionalEntity.isPresent()) {
            throw new BizException(getNotFoundExceptionType());
        }
        return optionalEntity.get();
    }


    @Override
    @Transactional
    public Dto update(String id, Dto dto) {
        // Todo: dto 可能无法控制更新字段
        Entity existedEntity = getEntity(id);
        Entity updatedEntity = getRepository().save(getMapper().updateEntity(existedEntity, dto));
        return getMapper().toDto(updatedEntity);
    }

    @Override
    public void delete(String id) {
        Entity existedEntity = getEntity(id);
        getRepository().delete(existedEntity);
    }

}