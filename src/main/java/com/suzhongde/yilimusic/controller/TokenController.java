package com.suzhongde.yilimusic.controller;

import com.suzhongde.yilimusic.dto.TokenCreateRequest;
import com.suzhongde.yilimusic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tokens")
public class TokenController {


    UserService userService;

    @PostMapping
    public String create(@RequestBody TokenCreateRequest tokenCreateRequest) {
        return userService.createToken(tokenCreateRequest);
    }

    
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
