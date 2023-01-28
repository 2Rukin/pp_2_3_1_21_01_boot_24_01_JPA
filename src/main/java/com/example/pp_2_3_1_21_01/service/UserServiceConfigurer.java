package com.example.pp_2_3_1_21_01.service;


import com.example.pp_2_3_1_21_01.model.User;

import java.util.List;

public interface UserServiceConfigurer {
    List<User> getUsersList();

    void addUser(User user);

    User getUserById(int id);

    void updateUser(int id, User updateUser);

    void deleteUser(int id);
}
