package com.dhu.user.repository;

import com.dhu.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * creater: LIUYING
 * date:2018/8/14 15:35
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,String>{
    /**
     * 根据用户邮箱和密码查询用户
     * @param email
     * @param password
     * @return
     */
    List<UserInfo> findByEmailAndPassword(String email, String password);

    List<UserInfo> findByUserId(String id);
}
