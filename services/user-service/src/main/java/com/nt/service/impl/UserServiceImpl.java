package com.nt.service.impl;

import com.nt.mapper.UserMapper;
import com.nt.model.User;
import com.nt.payload.dto.UserDTO;
import com.nt.repository.UserRepository;
import com.nt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDTO getUserByEmail(String email) throws Exception {
        User user = userRepository.findByEmail(email);
        if(user==null){
            throw new Exception("User not found with email");
        }
        return UserMapper.toDTO(user);
    }

    @Override
    public UserDTO getUserById(Long id) throws Exception {
        User user = userRepository.findById(id).orElseThrow(
                ()->new Exception("user not found with id "+id)
        );
        return UserMapper.toDTO(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
