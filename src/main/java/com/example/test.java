package com.example;

import com.example.config.SpringConfig;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * @author luo
 * 登录测试
 */
public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");
        boolean userByName = userService.findUserByName(user);
        System.out.println(userByName);
        System.out.println(user);

    }
}
