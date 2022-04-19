package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.UserCreateDto;
import com.suzhongde.yilimusic.dto.UserDto;
import com.suzhongde.yilimusic.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;


public interface UserService extends UserDetailsService {
    List<UserDto> list();

    UserDto create(UserCreateDto userCreateDto);

    @Override
    User loadUserByUsername(String username);
}
