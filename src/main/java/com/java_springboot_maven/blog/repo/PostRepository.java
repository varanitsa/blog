package com.java_springboot_maven.blog.repo;

import com.java_springboot_maven.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
