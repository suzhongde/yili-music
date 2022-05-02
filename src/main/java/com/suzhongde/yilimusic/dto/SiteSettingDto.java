package com.suzhongde.yilimusic.dto;

import com.suzhongde.yilimusic.enums.Storage;
import lombok.Data;

@Data
public class SiteSettingDto {
    private String bucket;

    private String region;

    private Storage storage;
}