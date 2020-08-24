package com.tony.test;

import com.tony.dao.UserDao;
import com.tony.domain.User;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void testLogin(){

        User loginuser = new User();
        loginuser.setUsername("Tony");
        loginuser.setPassword("123");

        UserDao dao = new UserDao();

        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
