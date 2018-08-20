package com.dhu.managerweb.service;

import com.dhu.managerweb.UserVO.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * creater: LIUYING
 * date:2018/8/19 12:33
 */

@FeignClient(name = "user",url = "http://localhost:9000/user")
public interface UserService {

    @RequestMapping(method = RequestMethod.GET, value = "/validate/{email}/{password}")
    UserVO validate(@PathVariable("email") String email,
                    @PathVariable("password") String password);
}
