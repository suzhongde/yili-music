package com.suzhongde.yilimusic.vo;

import com.suzhongde.yilimusic.enums.Gender;
import lombok.Data;

import java.util.List;

@Data
public class UserVo extends BaseVo {

    private String id;

    private String username;

    private String nickname;

    private Gender gender;

    private Boolean locked;

    private Boolean enabled;
    
    private List<RoleVo> roles;
}
