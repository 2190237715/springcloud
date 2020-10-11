package com.xin.product.service;

import com.xin.product.entity.Product;

import java.util.List;

/**
 * @description: 商品业务接口
 * @author: fuqinagxin
 * @time: 2020-09-14 16:14
 */
public interface ProductService {

    //增加
    void saveProduct(Product product);

    //删除
    void deleteProduct(Long id);

    //修改
    void updateProduct(Product product);

    //根据id查询
    Product findById(Long id);

    //查询列表
    List<Product> listProduct();
}
