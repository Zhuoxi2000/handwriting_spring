package main.cn.wzx.springframework.beans.factory.support;

import main.cn.wzx.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    //使用final 使当前 singletonObjects 无法指向其他对象
    private final Map<String, Object> singletonObjects = new HashMap<>();


    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
