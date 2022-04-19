package com.suzhongde.yilimusic.mapper;

import com.suzhongde.yilimusic.dto.UserCreateDto;
import com.suzhongde.yilimusic.dto.UserDto;
import com.suzhongde.yilimusic.entity.User;
import com.suzhongde.yilimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);

    User createEntity(UserCreateDto userCreateDto);
}
