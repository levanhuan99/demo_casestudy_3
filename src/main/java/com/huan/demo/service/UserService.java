package com.huan.demo.service;

import com.huan.demo.model.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User getUserByName(String name);

}
