package com.myapp.springmvcsecurityuserregistration.dao;

import com.myapp.springmvcsecurityuserregistration.entity.User;

public interface UserDao {

    User findByUserName(String username);

    void save(User theUser);
}
