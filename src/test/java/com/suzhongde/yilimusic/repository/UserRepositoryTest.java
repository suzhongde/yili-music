package com.suzhongde.yilimusic.repository;

import com.suzhongde.yilimusic.entity.User;
import com.suzhongde.yilimusic.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;


    @Test
    void findByUsername() {
        User user = new User();
        user.setUsername("依力");
        user.setNickname("程序员依力");
        user.setEnabled(true);
        user.setLocked(false);
        user.setPassword("9095155");
        user.setGender(Gender.MALE);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Date());

        User savedUser = repository.save(user);

        User result = repository.getByUsername("依力");
        System.out.printf(result.toString());
    }
}