package com.suzhongde.yilimusic.service;

import com.suzhongde.yilimusic.dto.UserCreateRequest;
import com.suzhongde.yilimusic.dto.UserDto;
import com.suzhongde.yilimusic.entity.User;
import com.suzhongde.yilimusic.enums.Gender;
import com.suzhongde.yilimusic.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public abstract class BaseTest {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @BeforeEach
    void setDefaultUser() {
        UserCreateRequest userCreateRequest = new UserCreateRequest();
        userCreateRequest.setUsername("yili");
        userCreateRequest.setNickname("yili");
        userCreateRequest.setPassword("900602");
        userCreateRequest.setGender(Gender.MALE);
        UserDto userDto = userService.create(userCreateRequest);

        User user = userService.loadUserByUsername(userDto.getUsername());
        userRepository.save(user);
    }
}