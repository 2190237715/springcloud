package com.xin.product.controller;

import com.xin.product.entity.Product;
import com.xin.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 商品控制
 * @author: fuqiangxin
 * @time: 2020-09-14 16:21
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${spring.cloud.client.ip-address}")
    private String ip;
    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public void saveProduct(Product product) {
        productService.saveProduct(product);
    }

    @DeleteMapping("/deleteProduct/id")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @PutMapping("/updateProduct")
    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

    @GetMapping("/findById/{id}")
    public Product findById(@PathVariable Long id) {
        Product product = productService.findById(id);
        product.setProduct_name("访问的地址："+ip+"："+port);
        return product;
    }

    @GetMapping("/listProduct")
    public List<Product> listProduct() {
        return productService.listProduct();
    }
}
