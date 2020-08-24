package com.tony.service.impl;

import com.tony.dao.UserDao;
import com.tony.dao.impl.UserDaoImpl;
import com.tony.domain.User;
import com.tony.service.UserService;

import java.util.List;

/**
 * Author: Tony
 * Blog: https://www.acming.net/
 * Date: 2020/8/24 9:40
 */

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();


    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }
}
