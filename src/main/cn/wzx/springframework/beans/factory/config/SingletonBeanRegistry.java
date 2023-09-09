package main.cn.wzx.springframework.beans.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
