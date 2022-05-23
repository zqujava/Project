package com.example.controller;

import com.example.domain.User;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/books")
@ResponseBody
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public boolean register(@RequestBody User user) {
        boolean findname = bookService.findName(user);
        if (findname) {
            System.out.println("已存在!");
        } else {
            System.out.println("插入成功！");
        }
        return findname;
    }

    @RequestMapping(value = "/changePwd", method = RequestMethod.PUT)
    public boolean changePwd(@RequestBody User user) {
        boolean findname = bookService.changePwd(user);
        if (findname) {
            System.out.println("修改成功！");
        } else {
            System.out.println("用户不存在！");
        }
        return findname;
    }

}
