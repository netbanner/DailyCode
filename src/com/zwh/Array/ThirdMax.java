package com.zwh.Array;

/**
 * @author zwh
 * @date 2022年08月09日 15:03
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 */
public class ThirdMax {

    /*
     *
     * @desc 我们可以遍历数组，并用三个变量 a、b 和 c 来维护数组中的最大值、次大值和第三大值
     * @date 2022/8/9 15:05
     * @param nums
     * @return int
     */
    public static int thirdMax(int []nums){
        Integer a=null,b=null,c=null;
        for(int num:nums){
            if(a==null||num>a){
                c=b;
                b=a;
                a=null;
            }else if(a>num&&(b==null||b<num)){
                c=b;
                b=num;
            }else if(b!=null&&b>num&&(c==null||c<num)){
                c=num;
            }

        }

        return c==null?a:c;
    }


}
