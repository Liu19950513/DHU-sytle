package com.dhu.user.service;

import com.dhu.user.VO.UserInfoVO;
import com.dhu.user.dataobject.UserInfo;

/**
 * creater: LIUYING
 * date:2018/8/14 15:48
 */
public interface UserService {
    UserInfo findByEmailAndPassword(String email, String password);
    UserInfoVO findUserInfo(String id);

}
