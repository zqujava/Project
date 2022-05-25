package com.example.controller;


import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author luo
 * 登录、注册、修改密码
 */
@RestController
@RequestMapping("/users")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean login(@RequestBody User user){

        System.out.println("login---success!");
        boolean userByName = userService.findUserByName(user);
        System.out.println(userByName);
        return userByName;
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public boolean register(@RequestBody User user) {
        boolean findname = userService.findName(user);
        if (findname) {
            System.out.println("已存在!");
        } else {
            System.out.println("插入成功！");
        }
        return findname;
    }

    @RequestMapping(value = "/changePwd", method = RequestMethod.PUT)
    public boolean changePwd(@RequestBody User user) {
        boolean findname = userService.changePwd(user);
        if (findname) {
            System.out.println("修改成功！");
        } else {
            System.out.println("用户不存在！");
        }
        return findname;
    }
}

