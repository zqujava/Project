package com.example.service;


import com.example.domain.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author luo
 * 登录、注册、修改密码
 */
@Transactional
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
