package com.xin.order.feign;

import com.xin.order.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@FeignClient(name = "service-product")//,fallback = ProductFeignClientCallBack.class
public interface ProductFeignClient {

//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    @GetMapping("/product/findById/{id}")
    public Product findById(@PathVariable Long id);
}
