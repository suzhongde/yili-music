package com.suzhongde.yilimusic.dto;

import com.suzhongde.yilimusic.vo.RoleVo;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String id;

    private String username;

    private String nickname;

    private List<RoleVo> roles;
}
