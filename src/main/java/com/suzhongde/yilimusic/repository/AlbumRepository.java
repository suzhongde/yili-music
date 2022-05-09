package com.suzhongde.yilimusic.repository;

import com.suzhongde.yilimusic.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlbumRepository extends JpaRepository<Album, String> {
}