package com.nt.service;

import com.nt.payload.dto.UserDTO;
import com.nt.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse login(String email, String password);
    AuthResponse signup(UserDTO req);
}
