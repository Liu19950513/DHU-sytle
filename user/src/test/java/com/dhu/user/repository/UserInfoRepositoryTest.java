package com.dhu.user.repository;

import com.dhu.user.UserApplication;
import com.dhu.user.UserApplicationTests;
import com.dhu.user.dataobject.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;
@Component
public class UserInfoRepositoryTest extends UserApplicationTests{
    @Autowired
    private UserInfoRepository userInfoRepository;
    @Test
    public void findByNameAndPassword() {
        List<UserInfo> list = userInfoRepository.findByEmailAndPassword("984092512@qq.com","asd13579");
        Assert.assertTrue(list.size()>0);
    }
}