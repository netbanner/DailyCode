package com.zwh.singlenton;

/**
 * @author zwh
 * @date 2022年06月26日 8:11 PM
 * @desc 饿汉模式(线程安全)
 */
public class Singlenton_3 {

    private static  Singlenton_3 intance = new Singlenton_3();

    private Singlenton_3(){}

    public static Singlenton_3 getInstace(){
        return intance;
    }
}
