package com.suzhongde.yilimusic.entity;

import com.suzhongde.yilimusic.enums.GeneralStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Album extends TraceableBaseEntity {
    private String name;

    private String description;

    private GeneralStatus status;

    @OneToOne
    private File cover;

    @ManyToMany
    @JoinTable(name = "album_artist", joinColumns = @JoinColumn(name = "album_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"))
    private List<Artist> artists;

    @ManyToMany
    @JoinTable(name = "album_music", joinColumns = @JoinColumn(name = "album_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "music_id", referencedColumnName = "id"))
    private List<Music> musicList;
}