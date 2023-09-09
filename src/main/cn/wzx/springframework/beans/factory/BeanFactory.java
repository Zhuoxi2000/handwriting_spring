package main.cn.wzx.springframework.beans.factory;

import main.cn.wzx.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
