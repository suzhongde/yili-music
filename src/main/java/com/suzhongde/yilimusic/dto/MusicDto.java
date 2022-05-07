package com.suzhongde.yilimusic.dto;

import com.suzhongde.yilimusic.enums.MusicStatus;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
public class MusicDto extends BaseDto {
    private String id;

    private String name;

    private MusicStatus status = MusicStatus.DRAFT;

    private String description;

    private FileDto file;

    private List<ArtistDto> artistList;
}
