package com.demo.proxyTest.test;



import com.demo.proxyTest.bean.ComponentScanBean;
import com.demo.proxyTest.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class AopTest {

    @Autowired
    UserService userService;

    private ApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentScanBean.class);
    }

    @Test
    public void test1() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.queryUser("test");
        //userService.addxx("1");
    }

    @Test
    public void test2() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.updatePromotionSite(1);
        //userService.addxx("1");
    }
}
