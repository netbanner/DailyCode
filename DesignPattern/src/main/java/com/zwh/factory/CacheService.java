package com.zwh.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author zwh
 * @date 2022年06月24日 2:41 PM
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
