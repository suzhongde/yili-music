package com.suzhongde.yilimusic.repository;

import com.suzhongde.yilimusic.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, String> {
}