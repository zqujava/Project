package com.example.dao;


import com.example.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {


    /**
     * 登录
     * @param user
     * @return
     */
    @Select("select * from login where username = #{username} and password = #{password}")
    public User findUserByName(User user);

    /**
     * 查找username
     * @param username
     * @return
     */
    @Select("select * from login where username = #{username}")
    public User findName(String username);

    /**
     * 注册
     * @param user
     * @return
     */
    @Select("insert into login (username, password) values(#{username},#{password})")
    public String registerUserName(User user);
}
