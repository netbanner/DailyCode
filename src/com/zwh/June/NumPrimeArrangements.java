package com.zwh.June;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwh
 * @date 2022年06月30日 3:24 PM
 */
public class NumPrimeArrangements {

    public static void main(String[] args) {
        NumPrimeArrangements npa = new NumPrimeArrangements();
        System.out.println(npa.numPrimeArrangements(100));
    }


    public int numPrimeArrangements(int n){
        int mod = (int)(1e9+7);
        List<Integer> numbers = new ArrayList<>();

        for(int i=2;i<=100;i++){
            boolean flag = true;
            //判断是非是质数
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag = false;
                }
            }
            if(flag){
                numbers.add(i);
            }
        }

        int l=0,r =numbers.size()-1;
        while(l<r){
            int mid = (l+r+1)>>1;
            //取列表中最多值小于n的数
            if(numbers.get(mid)<=n){
                l = mid;
            }else{
                r = mid-1;
            }
        }
        //质数个数
        long ans = 1;
        int a=r+1,b=n-a;
        for(int i=a;i>1;i--){
            ans = ans*i%mod;
        }
        for(int i=b;i>1;i--){
            ans = ans*i%mod;
        }
        return (int)ans;

    }
}
