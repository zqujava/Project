package com.example.service.impl;


import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private UserDao userDao;


    public boolean findUserByName(User user) {
        if (userDao.findUserByName(user)!=null){
            return true;
        }else {
            return false;
        }
    }
    public boolean registerUserName(User user){
        User userByName = userDao.findUserByName(user);
        System.out.println(userByName);
        if (userByName!=null){
            return true;
        }else {
            userDao.registerUserName(user);
            return false;
        }
    }

    public boolean findName(User user) {
        User userByName = userDao.findName(user.getUsername());
        System.out.println(userByName);
        if (userByName!=null){
            return true;
        }else {
            userDao.registerUserName(user);
            return false;
        }
    }


}
