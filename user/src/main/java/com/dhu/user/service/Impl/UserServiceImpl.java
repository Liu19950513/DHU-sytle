package com.dhu.user.service.Impl;

import com.dhu.user.VO.UserInfoVO;
import com.dhu.user.dataobject.UserInfo;
import com.dhu.user.repository.UserInfoRepository;
import com.dhu.user.service.UserService;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * creater: LIUYING
 * date:2018/8/14 16:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByEmailAndPassword(String email, String password){
        List<UserInfo> list = userInfoRepository.findByEmailAndPassword(email,password);
        return list.size() == 1 ? list.get(0): new UserInfo();
    }

    @Override
    public UserInfoVO findUserInfo(String id){
        List<UserInfo> userInfoList = userInfoRepository.findByUserId(id);
        UserInfoVO userInfoVO = new UserInfoVO();
        BeanUtils.copyProperties(userInfoList.get(0),userInfoVO);
        return userInfoVO;
    }
}
