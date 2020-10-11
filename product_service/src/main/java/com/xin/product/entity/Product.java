package com.xin.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @description: 商品实体
 * @author: fuqinagxin
 * @time: 2020-09-14 16:14
 */
@Data
@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    private Long id;
    private String product_name;//名称
    private Integer status;//状态
    private BigDecimal price;//单价
    private String product_desc;//描述
    private String caption;//标题
    private Integer inventory;//库存
}
