package com.dzx.ssm.service.impl;

import com.dzx.ssm.utils.BeanUtil;
import org.slf4j.event.EventConstants;

import java.util.Date;


public class TestService {
    public static void main(String[] args) {
        EventConstants eventConstants = new EventConstants();
        eventConstants.test();
    }



    public void test(){
        System.out.println("Test get bean!");
    }

}