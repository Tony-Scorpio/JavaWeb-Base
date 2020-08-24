package com.tony.dao;


import com.tony.domain.User;

import java.util.List;

/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/24 9:44
 */

/**
 * 用户操作的DAO
 */
public interface UserDao {
    public List<User> findAll();
}
