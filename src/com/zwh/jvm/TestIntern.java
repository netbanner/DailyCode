package com.zwh.jvm;

/**
 * @author zwh
 * @date 2022年08月31日 21:31
 */
public class TestIntern {

    public static void main(String[] args) {
        String s1 = new String("test");
        String s2 = s1.intern();
        System.out.println(s1==s2)  ;

        String s= new String("he")+new String("llo");
        String s3=s.intern();

         System.out.println(s==s3);
    }
}
