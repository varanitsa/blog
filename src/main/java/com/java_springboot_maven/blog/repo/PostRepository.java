package com.java_springboot_maven.blog.repo;

import com.java_springboot_maven.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> {
    Optional<Post> findAllById(long id);
}
