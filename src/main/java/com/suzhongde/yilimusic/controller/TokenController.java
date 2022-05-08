package com.suzhongde.yilimusic.controller;

import com.suzhongde.yilimusic.dto.TokenCreateRequest;
import com.suzhongde.yilimusic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tokens")
public class TokenController {


    UserService userService;

    @PostMapping
    public String create(@RequestBody TokenCreateRequest tokenCreateRequest) {
        return userService.createToken(tokenCreateRequest);
    }

    @PostMapping("/mp")
    public String createByMp(@RequestHeader(name = "X-WX-OPENID") String openId) {
        return userService.createTokenByOpenId(openId);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
