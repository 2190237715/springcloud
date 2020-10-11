package com.xin.order.feign;

import com.xin.order.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

//@Component
public class ProductFeignClientCallBack  implements ProductFeignClient{


    public Product findById(@PathVariable Long id){
        Product product = new Product();
        product.setProduct_name("触发feign熔断降级");
        return product;
    }
}
