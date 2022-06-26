package com.zwh.BinarySearch.two;

/**
 * @author zwh
 * @date 2022年06月24日 7:54 PM
 */
public class Test {

    public static void main(String[] args) {

        int []nums = new int[]{1,2,5,9};
        int mid =5;
        int sum =0;
        for(int num:nums){
            int p = num/mid;
            if(p*mid<num){
                p=p+1;
            }

            sum +=p;
            System.out.println("sum="+sum+",p="+p);
        }
    }
}
