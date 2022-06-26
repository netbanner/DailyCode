package com.zwh.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author zwh
 * @date 2022年06月24日 1:54 PM
 * @定义适配接口
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key,String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
