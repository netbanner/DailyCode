package com.zwh.jvm;

/**
 * @author zwh
 * @date 2022年08月31日 17:05
 */
public class ThreeColorRemark {

    public static void main(String[] args) {
         A a = new A();
        //读
         D d =a.b.d;
         //写
         a.b.d  = null;

         a.d =d; //写
    }


}
class A{
    B b = new B();
    D d = null;
}

class B{
    C c = new C();
    D d = new D();
}

class C{

}

class D{

}
