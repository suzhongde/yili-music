package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.UserCreateRequest;
import com.suzhongde.yilimusic.dto.UserDto;
import com.suzhongde.yilimusic.dto.UserUpdateRequest;
import com.suzhongde.yilimusic.entity.User;
import com.suzhongde.yilimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);

    User createEntity(UserCreateRequest userCreateRequest);

    User updateEntity(@MappingTarget User user, UserUpdateRequest userUpdateRequest);
}
