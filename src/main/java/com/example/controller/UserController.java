package com.example.controller;


import com.example.domain.User;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@ResponseBody
public class UserController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public boolean login(@RequestBody User user){

        System.out.println("login---success!");
        boolean userByName = bookService.findUserByName(user);
        System.out.println(userByName);
        return userByName;
    }

}

