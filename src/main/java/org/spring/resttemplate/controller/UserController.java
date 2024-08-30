package org.spring.resttemplate.controller;

import lombok.RequiredArgsConstructor;
import org.spring.resttemplate.dto.response.UserDto;
import org.spring.resttemplate.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

}
