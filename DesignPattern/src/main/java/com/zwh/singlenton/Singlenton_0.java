package com.zwh.singlenton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zwh
 * @date 2022年06月26日 8:06 PM
 * @desc 静态类使用
 */
public class Singlenton_0 {

    public static Map<String,String> intance = new ConcurrentHashMap<>();
}
