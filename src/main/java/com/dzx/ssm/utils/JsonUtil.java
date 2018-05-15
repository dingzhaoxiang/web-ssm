package com.dzx.ssm.utils;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class JsonUtil {
    //对象-->Json字符串
    public static String marshalToString(Object obj) {
        return JSON.toJSONString(obj); // 默认为UTF-8
    }

    //Json字符串-->对象
    public static <T> T unmarshalFromString(String json, Class<T> targetClass) {
        return JSON.parseObject(json, targetClass);// 默认为UTF-8
    }

    //Json字符串-->对象列表
    public static <T> List<T> unmarshalFromString2List(String json, Class<T> targetClass) {
        return JSON.parseArray(json, targetClass); // 默认为UTF-8
    }
}
