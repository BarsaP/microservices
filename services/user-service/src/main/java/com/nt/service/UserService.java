package com.nt.service;

import com.nt.model.User;
import com.nt.payload.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO getUserByEmail(String email) throws Exception;
    UserDTO getUserById(Long id) throws Exception;
    List<User> getAllUsers();
}
