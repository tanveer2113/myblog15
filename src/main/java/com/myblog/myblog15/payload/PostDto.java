package com.myblog.myblog15.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private long id;
    private String title;
    private String description;
    private String content;
}

