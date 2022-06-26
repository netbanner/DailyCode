package com.zwh.June;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 数对 (a,b) 由整数 a 和 b 组成，其数对距离定义为 a 和 b 的绝对差值。
 *
 * 给你一个整数数组 nums 和一个整数 k ，数对由 nums[i] 和 nums[j] 组成且满足 0 <= i < j < nums.length 。返回 所有数对距离中 第 k 小的数对距离。
 *
 * 0 <= i, j < nums.length
 * i != j
 * nums[i] - nums[j] == k
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-k-th-smallest-pair-distance
 * 输入：nums = [3, 1, 4, 1, 5], k = 2
 * 输出：2
 * 解释：数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
 */
public class SmallestDistancePair {
    public static void main(String[] args) {
        System.out.println(smallestDistancePair(new int[]{3,1,4,1,5},2));

        System.out.println(smallestDistancePair2(new int[]{3,1,4,1,5},2));
    }

    public static int smallestDistancePair(int []nums,int k){
        Arrays.sort(nums);
        //双指针
        //1，1，3，4，5
        int res=0;
        for(int i=0,j=1;i<nums.length;i++){
            if(i>0&&nums[i-1]==nums[i]){
                //跳过当前查询
                continue;
            }
            //需要j > i，有可能去重时导致i >= j
            if(i<=j){
                j++;
            }
            //二分查找
            while (j<nums.length&&nums[j]<nums[i]+k){
                j++;
            }
            if(j<nums.length&&nums[j]==nums[i]+k){
                res++;
            }
        }
        return  res;
    }

    public static int smallestDistancePair2(int []nums,int k){

       //当前数组
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num:nums){
            if(set1.contains(num-k)){
                set2.add(num-k);
            }
            if(set1.contains(num+k)){
                set2.add(num);
            }
            set1.add(num);
            System.out.println("set1="+set1+",set2="+set2);
        }


        return set2.size();
    }
}
