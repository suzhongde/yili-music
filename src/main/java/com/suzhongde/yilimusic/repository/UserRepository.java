package com.suzhongde.yilimusic.repository;

import com.suzhongde.yilimusic.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, String> {

    User getByUsername(String username);

    Optional<User> findByUsername(String username);
}
