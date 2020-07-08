package com.huan.demo.service;

import com.huan.demo.model.User;

import com.huan.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User getUserByName(String name) {
        return userRepository.findUserByName(name);
    }

    @Override
    public UserDetails loadUserByUsername(String name) {
        User user = this.getUserByName(name);
        List<GrantedAuthority> roleList = new ArrayList<>();
        roleList.add(user.getRole());
        org.springframework.security.core.userdetails.User user1 = new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), roleList);
        return user1;
    }
}
