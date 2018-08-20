package com.dhu.user.service;

import com.dhu.user.UserApplicationTests;
import com.dhu.user.dataobject.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.Assert.*;

@Component
public class UserServiceTest extends UserApplicationTests {
    @Autowired
    private  UserService userService;
    @Test
    public void findByNameAndPassword() {
        UserInfo userInfo = userService.findByEmailAndPassword("984092512@qq.com","asd13579");
        Assert.assertTrue(userInfo != null);
    }
}