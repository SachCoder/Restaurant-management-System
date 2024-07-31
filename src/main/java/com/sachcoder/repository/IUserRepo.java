package com.sachcoder.repository; 
 

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachcoder.entities.User;

public interface IUserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
