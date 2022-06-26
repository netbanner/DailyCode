package com.zwh.factory;

import com.zwh.factory.demo.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author zwh
 * @date 2022年06月24日 2:07 PM
 */
public class EGMCacheAdapter  implements  ICacheAdapter{

    private EGM egm = new EGM();
    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key,value,timeout,timeUnit);
    }

    @Override
    public void del(String key) {
        egm.del(key);
    }
}
