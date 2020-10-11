package com.xin.product.dao;

import com.xin.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @description: 商品数据接口
 * @author: fuqinagxin
 * @time: 2020-09-14 16:14
 */
@Repository
public interface ProductDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
