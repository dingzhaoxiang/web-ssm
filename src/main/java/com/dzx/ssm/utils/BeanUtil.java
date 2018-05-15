package com.dzx.ssm.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author:DingZhaoxiang
 * @Description:
 * @Date 14:57  2018/5/8
 **/
public class BeanUtil {
    public static <T> T getBean(String path,String id,Class<T> targetClass){
        ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:GetBeanTest.xml");
        return (T)ac.getBean(id);
    }
}
