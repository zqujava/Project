package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * @author luo
 * springMvc配置类
 */
@Configuration
@ComponentScan({"com.example.controller", "com.example.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
