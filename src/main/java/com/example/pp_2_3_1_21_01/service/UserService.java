package com.example.pp_2_3_1_21_01.service;

import com.example.pp_2_3_1_21_01.repositories.UserDao;
import com.example.pp_2_3_1_21_01.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {

        this.userDao = userDao;
    }


    @Transactional(readOnly = true)
    public List<User> getUsersList() {
        return userDao.findAll();
    }


    @Transactional
    public void addUser(User user) {
        userDao.save(user);
    }


    @Transactional
    public User getUserById(Long id) {
        Optional<User> user = userDao.findById(id);
        return user.orElse(null);
    }

    @Transactional
    public void updateUser(Long id, User updateUser) {
        updateUser.setId(id);
        userDao.save(updateUser);


    }

    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }
}
