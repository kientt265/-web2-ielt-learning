package com.spring.fantasyielts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fantasyielts.entity.AuthUser;
import com.spring.fantasyielts.entity.JwtResponse;
import com.spring.fantasyielts.repository.AuthUserRepository;
import com.spring.fantasyielts.util.JwtUtil;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
    private final AuthUserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody AuthUser user) {
        try {
            if (!userRepository.findByUsername(user.getUsername()).isPresent()) 
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Username does not exist");
                
            Authentication authentication =authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);

            String token = jwtUtil.generateToken(user);
            return ResponseEntity.ok(new JwtResponse(token));
        } catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials" + e.toString());
        }
    }

    @PostMapping("/register")
    public ResponseEntity registerUser(@RequestBody AuthUser user) {
        try {
            if (userRepository.findByUsername(user.getUsername()).isPresent()) 
                return ResponseEntity.status(HttpStatus.CONFLICT).body("Username already exist");
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            AuthUser save = userRepository.save(user); 
            return ResponseEntity.ok(HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.toString());
        }
    }
}
