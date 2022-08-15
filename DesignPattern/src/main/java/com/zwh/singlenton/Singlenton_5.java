package com.zwh.singlenton;

/**
 * @author zwh
 * @date 2022年06月26日 8:17 PM
 * @desc 双程锁校念
 * 双重锁的方式是方法级锁的优化，减少了部分获取实例的耗时。
 * 同时这种方式也满足了懒加载。
 *
 */
public class Singlenton_5 {


    private static volatile Singlenton_5 intance;

    private Singlenton_5(){}

    public static Singlenton_5 getIntance() {
        if(intance==null){
            synchronized (Singlenton_5.class){
                if(intance==null){
                    intance = new Singlenton_5();
                }
            }
        }

        return intance;
    }
}
