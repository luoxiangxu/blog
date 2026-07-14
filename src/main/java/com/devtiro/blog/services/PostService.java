package com.devtiro.blog.services;

import java.util.List;
import java.util.UUID;

import com.devtiro.blog.domain.entities.Post;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
}
