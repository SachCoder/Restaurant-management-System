package com.sachcoder.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sachcoder.entities.User;
import com.sachcoder.exception.NotFoundException;
import com.sachcoder.repository.IUserRepo;

@Service
public class UserService {
    private final IUserRepo userRepo;

    public UserService(IUserRepo userRepository) {
        this.userRepo = userRepository;
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found"));
    }

    public User getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
