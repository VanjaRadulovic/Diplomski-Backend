package com.example.demo.controllers;

import com.example.demo.dtos.ContentDto;
import com.example.demo.dtos.JwtAuthenticationResponse;
import com.example.demo.dtos.SignInRequest;
import com.example.demo.dtos.SignUpRequest;
import com.example.demo.services.AuthenticationService;
import com.example.demo.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import lombok.RequiredArgsConstructor;
@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignUpRequest request) {
        return authenticationService.signup(request);
    }
    //        JwtAuthenticationResponse response = authenticationService.signin(request);
//        if(response==null)
//            return ResponseEntity.status(403).body("Bad credentials");
//        else
//            return ResponseEntity.ok(response);
    @PostMapping("/signin")
    public JwtAuthenticationResponse signin(@RequestBody SignInRequest request) {
        return authenticationService.signin(request);
    }

    @PostMapping("/bizsignup")
    public JwtAuthenticationResponse Bizsignup(@RequestBody SignUpRequest request) {
        return authenticationService.bizsignup(request);
    }

    @PostMapping("/bizsignin")
    public JwtAuthenticationResponse Bizsignin(@RequestBody SignInRequest request) {
        return authenticationService.bizsignin(request);
    }
    @GetMapping("/greetings")
    public ResponseEntity<ContentDto> greetings() {
        return ResponseEntity.ok(new ContentDto("Hello from backend!"));
    }
}