package test.java.cn.wzx.springframework.test;

import main.java.cn.wzx.springframework.BeanDefinition;
import main.java.cn.wzx.springframework.BeanFactory;
import test.java.cn.wzx.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring

https://github.com/DerekYRC/mini-spring
https://github.com/code4craft/tiny-spring
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
