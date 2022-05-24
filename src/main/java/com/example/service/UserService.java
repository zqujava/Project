package com.example.service;


import com.example.domain.User;

public interface UserService {
    /**
     * 登录
     * @param user
     * @return
     */
    public boolean findUserByName(User user);

    /**
     * 修改密码
     * @param user
     * @return
     */
    public boolean changePwd(User user);

    /**
     * 通过username查找是否存在该username
     * @param user
     * @return
     */
    public boolean findName(User user);


}
