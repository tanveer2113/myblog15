package com.myblog.myblog15.service;

import com.myblog.myblog15.payload.PostDto;
import com.myblog.myblog15.service.impl.PostServiceImpl;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
