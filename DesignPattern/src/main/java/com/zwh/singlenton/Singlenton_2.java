package com.zwh.singlenton;

/**
 * @author zwh
 * @date 2022年06月26日 8:10 PM
 * @desc 懒汉模式(线程安全)
 */
public class Singlenton_2 {

    private static Singlenton_2 intance;

    private Singlenton_2(){}

    public static synchronized Singlenton_2 getIntance() {
        if(intance==null){
            intance = new Singlenton_2();
        }
        return intance;
    }
}
