package com.xin.product.service.impl;

import com.xin.product.dao.ProductDao;
import com.xin.product.entity.Product;
import com.xin.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 商品业务实现
 * @author: fuqinagxin
 * @time: 2020-09-14 16:14
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void saveProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productDao.deleteById(id);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id).get();
    }

    @Override
    public List<Product> listProduct() {
        return productDao.findAll();
    }
}
