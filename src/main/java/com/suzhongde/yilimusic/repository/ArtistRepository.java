package com.suzhongde.yilimusic.repository;

import com.suzhongde.yilimusic.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, String> {
    Optional<Artist> findById(String id);
}