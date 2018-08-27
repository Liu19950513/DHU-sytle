package com.dhu.user.controller;

import com.dhu.user.VO.ResultVO;
import com.dhu.user.VO.UserInfoVO;
import com.dhu.user.VO.UserVO;
import com.dhu.user.dataobject.UserInfo;
import com.dhu.user.service.UserService;
import com.dhu.user.utils.ResultVOUtil;
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

    /**
     * 用户登陆验证
     * @param email
     * @param password
     * @return
     */
    @GetMapping(value = "/validate/{email}/{password}")
    public ResultVO<UserInfoVO> validate(@PathVariable String email, @PathVariable String password){
        UserInfo userInfo = userService.findByEmailAndPassword(email,password);

        UserInfoVO userInfoVO = new UserInfoVO();
        BeanUtils.copyProperties(userInfo,userInfoVO);
        return ResultVOUtil.success(userInfoVO);
    }

    @PostMapping("/register/")
    public String register(@RequestBody UserVO userVO){
        System.out.println(userVO.getEmail());
        UserInfo user = userService.IsExist(userVO.getEmail());

        if(user.getUserId() != null){
            return "用户已存在，请勿重复注册！";
        }
        else{
            BeanUtils.copyProperties(userVO,user);
            userService.register(user);
            return "注册成功！";
        }
    }

    @PostMapping("/update")
    public void update(@RequestBody UserInfoVO user) {
        userService.update(user);
    }

    @PostMapping("/userInfoForRecommend")
    public UserInfoVO listForRecommend(@RequestParam Long userId){
        return userService.findUserInfo(userId);
    }

}
