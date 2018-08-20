package com.dhu.managerweb.controller;

import com.dhu.managerweb.UserVO.UserVO;
import com.dhu.managerweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * creater: LIUYING
 * date:2018/8/19 13:37
 */
@Controller
@RequestMapping(value = "/manager")
public class ManagerController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String login(@ModelAttribute UserVO loginUser, Model model ){
        if(loginUser.getEmail() == null){
            //验证失败
            model.addAttribute("message","请输入有效邮箱！");
            return "login";
        }
        //调用验证服务
        UserVO dataUser = userService.validate(loginUser.getEmail(),loginUser.getPassword());
        if(dataUser.getUserId() == null){
            //验证失败
            model.addAttribute("message","登陆失败！");
            return "login";
        }else{
            model.addAttribute("user",dataUser);
            return "home";
        }
    }
}
