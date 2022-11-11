package com.zwh.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zwh
 * @date 2022年09月30日 15:30
 * @desc
 */
public class SingleNumber {


    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();

        System.out.println(singleNumber.singleNumber(new int[]{4,4,3,3,2}));
    }

    public int singleNumber(int []nums){
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
                System.out.println(ans);
            }
        }
        return ans;

    }
}
