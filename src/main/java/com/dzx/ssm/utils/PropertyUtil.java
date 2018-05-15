package com.dzx.ssm.utils;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;
//该工具类用来读取properties中的配置文件属性
public class PropertyUtil {

    public static String getProperty(String path,String keyName){
        Properties props= null;
        String property = null;
        try {
            props= PropertiesLoaderUtils.loadAllProperties("common.properties");
            property = props.getProperty(keyName);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }return property;

    }

    public static void main(String [] args){
        System.out.println(getProperty("common.properties","url"));
        System.out.println(getProperty("properties/common.properties","abc"));
    }
}
