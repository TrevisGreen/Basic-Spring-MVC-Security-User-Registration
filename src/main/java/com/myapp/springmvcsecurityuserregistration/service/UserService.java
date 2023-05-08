package com.myapp.springmvcsecurityuserregistration.service;

import com.myapp.springmvcsecurityuserregistration.entity.User;
import com.myapp.springmvcsecurityuserregistration.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User findByUserName(String username);

    void save(WebUser webUser);
}
