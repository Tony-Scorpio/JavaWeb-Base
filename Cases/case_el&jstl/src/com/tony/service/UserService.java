package com.tony.service;

import com.tony.domain.User;

import java.util.List;

/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/24 9:39
 */

/**
 * 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();
}
