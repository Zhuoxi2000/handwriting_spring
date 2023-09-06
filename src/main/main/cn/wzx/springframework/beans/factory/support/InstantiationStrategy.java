package cn.wzx.springframework.beans.factory.support;

import cn.wzx.springframework.beans.BeansException;
import cn.wzx.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;


public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
