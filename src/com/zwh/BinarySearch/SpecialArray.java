package com.zwh.BinarySearch;

import java.util.Arrays;

public class SpecialArray {

    public static int specialArray(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);

        int l=0,h=len-1;
        int count=0;
        while(l<h){
            int mid = l+(h-l)/2;
            if(nums[mid]>mid){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        System.out.println(nums);
        System.out.println(l);
        return nums[l]==l?nums[l]:-1;
    }

    public static void main(String[] args) {
        specialArray( new int[]{0,4,3,0,4});
    }
}
