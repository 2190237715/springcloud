package com.xin.test;

import com.xin.bean.EnableUserBean;
import com.xin.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-16 10:28
 */
@EnableUserBean
public class TestApplication {

    /*
     *-->EnableUserBean-->UserImportSelector-->Userconfiguration
     */
    public static void main(String[] args) {
        //获取spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestApplication.class);
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
