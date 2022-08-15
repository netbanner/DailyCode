package com.zwh.singlenton;

/**
 * @author zwh
 * @date 2022年06月26日 8:26 PM
 * 枚举单例(线程安全)
 */
public enum Singlenton_7 {
    INTANCE;

    public void test(){
        System.out.println("hi~");
    }
}
