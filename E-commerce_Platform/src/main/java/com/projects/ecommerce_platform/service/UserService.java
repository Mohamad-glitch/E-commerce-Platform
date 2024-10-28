package com.projects.ecommerce_platform.service;

import com.projects.ecommerce_platform.DAO.UserDAO;
import com.projects.ecommerce_platform.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    public void addUser() {
        User newUser = new User("mohamad", "mohamad2003", "mohamad@gmail.com"
                , 132456789, "whatever", "shlools");

        userDAO.save(newUser);
    }


}
