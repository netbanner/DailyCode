package com.zwh.factory;

import com.zwh.factory.demo.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author zwh
 * @date 2022年06月24日 1:57 PM
 */
public class IRRCacheAdapter  implements ICacheAdapter{

    private IIR iir = new IIR();
    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
     iir.setExpire(key,value,timeout,timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
