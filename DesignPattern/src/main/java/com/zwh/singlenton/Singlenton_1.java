package com.zwh.singlenton;

/**
 * @author zwh
 * @date 2022年06月26日 8:07 PM
 * @desc 懒汉模式(不安全)
 */
public class Singlenton_1 {

    private static Singlenton_1 intance;

    private Singlenton_1(){}

    public static Singlenton_1 getIntance() {
        if(intance==null){
            intance = new Singlenton_1();
        }
        return intance;
    }
}
