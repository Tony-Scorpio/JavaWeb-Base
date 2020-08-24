package com.tony.test;

import com.tony.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {

    @Test
    public void test(){

        User user = new User();
        try {
            BeanUtils.setProperty(user,"hehe","male");
            System.out.println(user);

            String gender = BeanUtils.getProperty(user, "hehe");
            System.out.println(gender);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
