package org.spring.resttemplate.controller;

import lombok.RequiredArgsConstructor;
import org.spring.resttemplate.dto.request.CreatePostRequest;
import org.spring.resttemplate.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<String> createPost(@RequestBody CreatePostRequest request) {

        return ResponseEntity.ok().body(postService.createPost(request));
    }

}
