package org.spring.resttemplate.service;

import lombok.RequiredArgsConstructor;
import org.spring.resttemplate.dto.request.CreatePostRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class PostService {

    private final RestTemplate restTemplate;

    @Value("${json-place-holder-base-url}")
    private String jsonPlaceHolderBaseUrl;

    public String createPost(CreatePostRequest request) {

        return restTemplate.postForObject(jsonPlaceHolderBaseUrl + "/posts", request, String.class);

    }

}
