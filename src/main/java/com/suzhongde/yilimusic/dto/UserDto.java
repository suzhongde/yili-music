package com.suzhongde.yilimusic.dto;

import com.suzhongde.yilimusic.enums.Gender;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {
    private String id;

    private String username;

    private String nickname;

    private List<RoleDto> roles;

    private Gender gender;

    private Boolean locked;

    private Boolean enabled;

    private String openId;

    private String lastLoginIp;

    private Date lastLoginTime;
}
