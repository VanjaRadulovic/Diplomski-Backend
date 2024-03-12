package com.example.demo.controllers;

import com.example.demo.services.JwtService;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final JwtService jwtService;
    @GetMapping("/data")
    public ResponseEntity<?> getUserData(@RequestHeader("Authorization") String token){
        String email  = jwtService.extractUserName(token.substring(7));
        return ResponseEntity.ok(userService.getUserData(email));
    }
}
