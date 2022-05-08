package com.suzhongde.yilimusic.entity;

import com.suzhongde.yilimusic.enums.ArtistStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Artist extends TraceableBaseEntity {

    private String name;

    private String remark;

    @OneToOne(cascade = CascadeType.PERSIST)
    private File photo;

    @ManyToMany
    @JoinTable(name = "artist_music", joinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "music_id", referencedColumnName = "id"))
    private List<Music> musicList;

    private ArtistStatus status = ArtistStatus.DRAFT;

    private Boolean recommended = false;

    private Integer recommendFactor = 0;
}