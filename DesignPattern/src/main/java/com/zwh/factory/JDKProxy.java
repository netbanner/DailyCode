package com.zwh.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zwh
 * @date 2022年06月24日 2:10 PM
 */
public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass ,ICacheAdapter cacheAdapter) throws Exception{
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader  = Thread.currentThread().getContextClassLoader();
        Class<?> []classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader,new Class[]{classes[0]},handler);

    }
}
