package com.dhu.recommend.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "clothes",url = "http://localhost:9010/clothes")
public interface ClothesClient {

}
