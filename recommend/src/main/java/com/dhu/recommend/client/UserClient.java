package com.dhu.recommend.client;


import com.dhu.recommend.VO.UserInfoVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user",url = "http://localhost:9000/user")
public interface UserClient {

    @PostMapping("/userInfoForRecommend")
    UserInfoVO listForRecommend(@RequestParam Long userId);


}
