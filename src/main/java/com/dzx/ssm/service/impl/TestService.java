package com.dzx.ssm.service.impl;

import com.dzx.ssm.utils.BeanUtil;

import java.util.Date;


public class TestService {
    public static void main(String[] args) {
        Date date = BeanUtil.getBean("classpath:GetBeanTest.xml","date",Date.class);
        System.out.println(date);
    }



    public void test(){
        System.out.println("Test get bean!");
    }

}