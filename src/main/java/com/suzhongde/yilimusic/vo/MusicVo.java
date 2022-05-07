package com.suzhongde.yilimusic.vo;

import com.suzhongde.yilimusic.enums.MusicStatus;
import lombok.Data;

import java.util.List;

@Data
public class MusicVo extends BaseVo {


    private String name;

    private MusicStatus status;

    private String description;

    private FileVo file;

    private List<ArtistVo> artistList;
}
