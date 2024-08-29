package org.spring.resttemplate.service;

import lombok.RequiredArgsConstructor;
import org.spring.resttemplate.dto.UserDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final RestTemplate restTemplate;

    @Value("${json-place-holder-base-url}")
    private String jsonPlaceHolderBaseUrl;

    public UserDto getUserById(int id) {

        return restTemplate.getForObject(jsonPlaceHolderBaseUrl + "/users/" + id, UserDto.class);
    }

    public List<UserDto> getAllUsers() {

        return restTemplate.getForObject(jsonPlaceHolderBaseUrl + "/users", List.class);
    }

}
