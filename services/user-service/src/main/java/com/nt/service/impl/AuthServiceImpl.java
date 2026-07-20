package com.nt.service.impl;

import com.nt.payload.dto.UserDTO;
import com.nt.payload.response.AuthResponse;
import com.nt.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse login(String email, String password) {
        return null;
    }

    @Override
    public AuthResponse signup(UserDTO req) {
        return null;
    }
}
