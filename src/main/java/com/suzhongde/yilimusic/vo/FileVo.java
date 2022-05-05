package com.suzhongde.yilimusic.vo;

import com.suzhongde.yilimusic.enums.FileStatus;
import com.suzhongde.yilimusic.enums.FileType;
import com.suzhongde.yilimusic.enums.Storage;
import lombok.Data;

@Data
public class FileVo extends BaseVo {
    private String name;

    private String key;

    private String uri;

    private Storage storage;

    private String ext;

    private Long size;

    private FileType type;

    private FileStatus status;
}
