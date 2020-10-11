package com.xin.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-16 10:23
 */
public class  UserImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //获取配置类的名称
        return new String[]{Userconfiguration.class.getName()};
    }
}
