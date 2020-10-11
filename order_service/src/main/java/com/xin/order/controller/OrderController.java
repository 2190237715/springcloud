package com.xin.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xin.order.command.OrderCommand;
import com.xin.order.entity.Product;
import com.xin.order.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 订单控制
 * @author: fuqiangxin
 * @time: 2020-09-14 17:13
 */
@RestController
@RequestMapping("/order")
//@DefaultProperties(defaultFallback = "defaultFallBack")
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Resource
    private ProductFeignClient productFeignClient;

    @GetMapping("show")
    public String show() {
        return "show";
    }

//        @GetMapping("/buy/{id}")
//    public Product findById(@PathVariable Long id) {
//        List<ServiceInstance> instances = discoveryClient.getInstances("SERVICE-PRODUCT");
//        ServiceInstance instance = instances.get(0);
//        Product product = restTemplate.getForObject("http://" + instance.getHost() + ":" + instance.getPort()
//                + "/product/findById/" + id, Product.class);
//        return product;
//    }

    /**
     * 基本ribbon的形式调用远程微服务
     *
     * @param id
     * @return
     */
//    @HystrixCommand(fallbackMethod = "orderFallBack")
//    @GetMapping("/buy/{id}")
//    public Product ribbonBuy(@PathVariable Long id) {
//        if (1 != id) {
//            throw new RuntimeException("服务器异常");
//        }
//        Product product = restTemplate.getForObject("http://service-product/product/findById/" + id, Product.class);
//        return product;
//    }

    /**
     * 基本Feign的形式调用远程微服务
     *
     * @param id
     * @return
     */
//    @HystrixCommand(fallbackMethod = "orderFallBack")
    @GetMapping("/buy/{id}")
    public Product feignBuy(@PathVariable Long id) {
        Product product = productFeignClient.findById(id);
        return product;
    }

    /**
     * @param id
     * @return
     */
//    @GetMapping("/buy/{id}")
//    public Product commandBuy(@PathVariable Long id) {
//        Product product = new OrderCommand(restTemplate, id).execute();
//        return product;
//    }
//    public Product orderFallBack(Long id) {
//        Product product = new Product();
//        product.setProduct_name("触发熔断降级");
//        return product;
//    }
//
//    public Product defaultFallBack() {
//        Product product = new Product();
//        product.setProduct_name("触发熔断降级");
//        return product;
//    }
}
