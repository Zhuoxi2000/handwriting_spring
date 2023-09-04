package main.java.cn.wzx.springframework;

import main.java.cn.wzx.springframework.beans.factory.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
