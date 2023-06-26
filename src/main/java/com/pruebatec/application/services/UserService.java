package com.pruebatec.application.services;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.pruebatec.application.entities.User;
import com.pruebatec.application.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) throws NotFoundException {
        return userRepository.findById(id)
                .orElseThrow(()-> new NotFoundException());
    }

    public User createUser(User user) {
        // Perform validation and save user to repository
        return userRepository.save(user);
    }

    public User updateUser(Integer id, User user) {
        // Perform validation, retrieve existing user by id, update fields, and save to repository
        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        // Delete user from repository by id
        userRepository.deleteById(id);
    }
}