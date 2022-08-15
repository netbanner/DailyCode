package com.zwh.singlenton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author zwh
 * @date 2022年06月26日 8:20 PM
 * @desc  CAS「AtomicReference」(线程安全)
 */
public class Singlenton_6 {


    private static final AtomicReference<Singlenton_6> INSTANCE = new AtomicReference<>();

    private Singlenton_6(){}

    public static final Singlenton_6 getInstance(){

        //自旋锁
        for(;;){
            Singlenton_6 instance = INSTANCE.get();
            if(null!=instance){
                return instance;
            }
            INSTANCE.compareAndSet(null,new Singlenton_6());
            return INSTANCE.get();
        }
    }
}
