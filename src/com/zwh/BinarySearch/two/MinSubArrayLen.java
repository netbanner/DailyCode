package com.zwh.BinarySearch.two;

import java.util.Arrays;

/**
 * 给定一个含有n个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * @Date 2022-06-20
 * @Desc 209. 长度最小的子数组
 *
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 */
public class MinSubArrayLen {


    public int minSubArrayLen(int target,int []nums){

        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++ ){
            int sum = nums[i];
            //计算[i~j]只和
            for(int j=i+1;j<nums.length;j++){
                sum +=nums[j];
                //判断出大于target 中元素个数
                if(sum>target){
                    min = Math.min(min,j-i+1);
                }
            }
        }

        return min==Integer.MAX_VALUE?0:min;
    }

    //二分查找
    //分析 【0——r】个数的和一定是单调递增的
    //计算出前n个数的和为sum[0~r}
    // sum[j]-sum[i]<=target的值->sum[j]<=target+sum[i]

    public int minSubArrayLen2(int target,int []nums){
        int min = Integer.MAX_VALUE;
        int []sum = new int[nums.length+1];

        for(int i=1;i<=nums.length;i++){
            sum[i] = sum[i-1]+nums[i-1];
        }

        for(int j=0;j<nums.length;j++){
            int t = sum[j]+target;
            //分析一下Arrays.binarySearch
            int index = Arrays.binarySearch(sum,t);
            if(index<=0){
                index = ~index;
            }
            if(index<=nums.length){
                min = Math.min(min,index-1);
            }
        }


        return min==Integer.MAX_VALUE?0:min;
    }

}
