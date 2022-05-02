package com.suzhongde.yilimusic.dto;

import com.suzhongde.yilimusic.enums.FileStatus;
import com.suzhongde.yilimusic.enums.FileType;
import com.suzhongde.yilimusic.enums.Storage;
import lombok.Data;

import java.util.Date;

@Data
public class FileDto {
    private String id;

    private String name;

    private String key;

    private String ext;

    private Long size;

    private FileType type;

    private Storage storage;

    private FileStatus status;

    private Date createdTime;

    private Date updatedTime;
}
