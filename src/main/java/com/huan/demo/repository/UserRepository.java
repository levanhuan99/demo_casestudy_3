package com.huan.demo.repository;

import com.huan.demo.model.Role;
import com.huan.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByName(String name);

}
