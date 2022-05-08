package com.suzhongde.yilimusic.dto;

import com.suzhongde.yilimusic.enums.PlayListStatus;
import lombok.Data;

import java.util.List;

@Data
public class PlaylistDto extends TraceableBaseDto {

    private String name;

    private String description;

    private FileDto cover;

    private PlayListStatus status;

    private List<MusicDto> musicList;

    private Boolean recommended;

    private Integer recommendFactor;

    private Boolean special;
}