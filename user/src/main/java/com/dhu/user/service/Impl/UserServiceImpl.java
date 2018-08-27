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
    public UserInfoVO findUserInfo(Long id){
        UserInfo userInfo = userInfoRepository.findByUserId(id);
        UserInfoVO userInfoVO = new UserInfoVO();
        BeanUtils.copyProperties(userInfo,userInfoVO);
        return userInfoVO;
    }

    @Override
    public UserInfo IsExist(String email){
        List<UserInfo> list = userInfoRepository.findByEmail(email);
        return list.size() == 1 ? list.get(0): new UserInfo();
    }

    @Override
    public  UserInfo register(UserInfo user){
        return userInfoRepository.save(user);
    }

    /**
     * 用户测评更新用户信息
     * @param userInfoVO
     * @return
     */
    @Override
    public UserInfo update(UserInfoVO userInfoVO){
        UserInfo user = userInfoRepository.findByUserId(userInfoVO.getUserId());
        user.setType(1);
        BeanUtils.copyProperties(userInfoVO, user);
        return userInfoRepository.save(user);
    }


    @Override
    public void writeOff(String email){

    }
}
