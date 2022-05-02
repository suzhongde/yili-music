package com.suzhongde.yilimusic.vo;

import com.suzhongde.yilimusic.enums.FileStatus;
import com.suzhongde.yilimusic.enums.FileType;
import lombok.Data;

@Data
public class FileVo extends BaseVo {
    private String name;

    private String key;

    private String ext;

    private Long size;

    private FileType type;

    private FileStatus status;
}
