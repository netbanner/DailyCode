package com.zwh.factory.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author zwh
 * @date 2022年06月24日 2:01 PM
 */
public class EGM {

    private Map<String,String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key){
        return dataMap.get(key);
    }

    public void set(String key,String value){
        dataMap.put(key,value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit){
        dataMap.put(key,value);
    }

    public void del(String key){
        dataMap.remove(key);
    }
}
