package com.example;

import com.example.config.SpringConfig;
import com.example.domain.User;
import com.example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");
        boolean userByName = bookService.findUserByName(user);
        System.out.println(userByName);
        System.out.println(user);

    }
}
