package com.example.pp_2_3_1_21_01.service;

import com.example.pp_2_3_1_21_01.model.User;
import com.example.pp_2_3_1_21_01.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceConfigurer {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsersList() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        Optional<User> findUser = userRepository.findById((long) id);
        return findUser.orElse(null);
    }

    @Override
    @Transactional
    public void updateUser(int id, User updateUser) {
        updateUser.setId(id);
        userRepository.save(updateUser);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userRepository.deleteById((long) id);
    }
}
