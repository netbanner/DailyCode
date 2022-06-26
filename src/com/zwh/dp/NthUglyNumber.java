package com.zwh.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwh
 * @date 2022年06月26日 4:42 PM
 */
public class NthUglyNumber {

    public static void main(String[] args) {
        NthUglyNumber nthUglyNumber = new NthUglyNumber();
        System.out.println(nthUglyNumber.nthUglyNumber(10));
    }

    public int nthUglyNumber(int n){
        //三路归并排序
        List<Integer> result = new ArrayList<>();
        result.add(1);
        int min =0;
        for(int i=0,j=0,k=0;result.size()<n;){
            min = Math.min(result.get(i) *2, Math.min(result.get(j) * 3, result.get(k) * 5));
            result.add(min);
            if(min==result.get(i)*2){
                ++i;
            }
            if(min==result.get(j)*3){
                ++j;
            }
            if(min==result.get(k)*5){
                ++k;
            }
        }

        return result.get(n-1);
    }
}
