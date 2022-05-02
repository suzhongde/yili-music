package com.suzhongde.yilimusic.vo;

import com.suzhongde.yilimusic.enums.Storage;
import lombok.Data;

@Data
public class SiteSettingVo {
    private String bucket;

    private String region;

    private Storage storage;
}