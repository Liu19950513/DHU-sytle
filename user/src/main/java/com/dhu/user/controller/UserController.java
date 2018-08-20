package com.dhu.user.controller;

import com.dhu.user.VO.UserInfoVO;
import com.dhu.user.VO.UserVO;
import com.dhu.user.dataobject.UserInfo;
import com.dhu.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * creater: LIUYING
 * date:2018/8/14 18:23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/validate/{email}/{password}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UserVO validate(@PathVariable String email,@PathVariable String password){
        UserInfo userInfo = userService.findByEmailAndPassword(email,password);
        if(userInfo != null){
            //用户登陆状态
            userInfo.setType(1);
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userInfo,userVO);
        return userVO;
    }

    @PostMapping("/userInfoForRecommend")
    public UserInfoVO listForRecommend(@RequestBody String userId){
        return userService.findUserInfo(userId);
    }
}
