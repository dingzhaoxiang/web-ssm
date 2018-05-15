package com.dzx.基础.设计模式.双重校验锁;

/**
 * Created by dzx on 2017/6/21.
 */
public class SingleTon {
    private volatile static SingleTon singleTon;
    private SingleTon(){}
    public static SingleTon getSingleTon(){
        if(singleTon==null){
            synchronized (SingleTon.class){
                if(singleTon==null){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
