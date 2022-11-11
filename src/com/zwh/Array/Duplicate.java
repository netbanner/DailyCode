package com.zwh.Array;

/**
 * @author zwh
 * @date 2022年10月18日 09:19
 * @desc
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * Input:
 * {2, 3, 1, 0, 2, 5}
 *
 * Output:
 * 2
 */
public class Duplicate {

    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        System.out.println(duplicate.duplicate(new int[]{2,3,1,0,2,5}));
    }


    private int duplicate(int []nums){

        int n = nums.length;
        int h=0,k=0;
        for(int i=0;i<n;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                h++;
             swap(nums,i,nums[i]);
                println(nums);
            }
            swap(nums,i,nums[i]);
            println(nums);
            k++;
        }
        System.out.println("h="+h);
        System.out.println("k="+k);
        return -1;
    }


    private void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void println(int []nums){
        StringBuilder stringBuilder = new StringBuilder();
        for(int n:nums){
            stringBuilder.append(n).append(",");
        }
        System.out.println(stringBuilder.toString());
    }

}
