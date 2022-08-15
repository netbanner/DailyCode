package com.zwh.singlenton;

/**
 * @author zwh
 * @date 2022年06月26日 8:14 PM
 * @desc 使用静态内部类(线程安全)
 */
public class Singlenton_4 {

    private static class SinglentonHolder{
        private static  Singlenton_4 intance = new Singlenton_4();
    }

    private Singlenton_4(){}

    public static Singlenton_4 getInstance(){
        return SinglentonHolder.intance;
    }
}
