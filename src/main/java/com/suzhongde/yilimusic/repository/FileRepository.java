package com.suzhongde.yilimusic.repository;

import com.suzhongde.yilimusic.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, String> {
}
