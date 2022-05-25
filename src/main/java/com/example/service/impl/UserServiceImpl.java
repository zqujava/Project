package com.example.service.impl;


import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author luo
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public boolean findUserByName(User user) {
        if (userDao.findUserByName(user)!=null){
            return true;
        }else {
            return false;
        }
    }
    public boolean changePwd(User user) {
        //查看是否查得到该用户名
        User name = userDao.findName(user.getUsername());
        System.out.println(name);
        if (name!=null){
            //查到则可以修改
            Integer i = userDao.changePwd(user);
            System.out.println(i);
            return true;
        }else {
            return false;
        }
    }

    public boolean findName(User user) {
        //查看是否查得到该用户名
        User name = userDao.findName(user.getUsername());
        System.out.println(name);
        if (name!=null){
            return true;
        }else {
            //没有查到则可以注册
            userDao.registerUserName(user);
            return false;
        }
    }


}
