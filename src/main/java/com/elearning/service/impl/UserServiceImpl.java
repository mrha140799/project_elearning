package com.elearning.service.impl;

import com.elearning.model.User;
import com.elearning.repository.UserRepository;
import com.elearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
