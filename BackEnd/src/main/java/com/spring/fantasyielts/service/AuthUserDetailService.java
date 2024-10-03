package com.spring.fantasyielts.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.fantasyielts.entity.AuthUser;
import com.spring.fantasyielts.repository.AuthUserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthUserDetailService implements UserDetailsService {

    private final AuthUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AuthUser> authUser = userRepository.findByUsername(username.toLowerCase());
        if (!authUser.isPresent()) {
            throw new UsernameNotFoundException(username);
        } else {
            return User.builder()
            .username(authUser.get().getUsername())
            .password(authUser.get().getPassword())
            .disabled(!authUser.get().isActive())
            .build();
        }
    }

}
