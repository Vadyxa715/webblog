package com.boundless.weblog.repo;

import com.boundless.weblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
