package com.myblog.myblog15.repository;

import com.myblog.myblog15.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

