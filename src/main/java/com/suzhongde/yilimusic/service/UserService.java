package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.TokenCreateRequest;
import com.suzhongde.yilimusic.dto.UserCreateRequest;
import com.suzhongde.yilimusic.dto.UserDto;
import com.suzhongde.yilimusic.dto.UserUpdateRequest;
import com.suzhongde.yilimusic.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    UserDto create(UserCreateRequest userCreateRequest);

    @Override
    User loadUserByUsername(String username);

    UserDto get(String id);

    UserDto update(String id, UserUpdateRequest userUpdateRequest);

    void delete(String id);

    Page<UserDto> search(Pageable pageable);
    
    String createToken(TokenCreateRequest tokenCreateRequest);

    UserDto getCurrentUser();
}
