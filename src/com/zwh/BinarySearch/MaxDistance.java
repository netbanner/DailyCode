package com.zwh.BinarySearch;

import java.sql.SQLOutput;

/**
 * @date 2022-06-17 2:50
 *
 * 1855. 下标对中的最大距离
 *
 * 给你两个 非递增 的整数数组 nums1和 nums2 ，数组下标均 从 0 开始 计数。
 *
 * 下标对 (i, j) 中 0 <= i < nums1.length 且 0 <= j < nums2.length 。如果该下标对同时满足 i <= j 且 nums1[i] <= nums2[j] ，则称之为 有效 下标对，该下标对的 距离 为 j - i​​ 。​​
 *
 * 返回所有 有效 下标对 (i, j) 中的 最大距离 。如果不存在有效下标对，返回 0 。
 *
 * 一个数组 arr ，如果每个 1 <= i < arr.length 均有 arr[i-1] >= arr[i] 成立，那么该数组是一个 非递增 数组。
 *
 *
 * 输入：nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
 * 输出：2
 * 解释：有效下标对是 (0,0), (2,2), (2,3), (2,4), (3,3), (3,4) 和 (4,4) 。
 * 最大距离是 2 ，对应下标对 (2,4) 。
 *
 */
public class MaxDistance {
        //：nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
    public  int maxDistance(int[] nums1, int[] nums2) {
            int res =0;
            for(int i=0;i<nums1.length;i++){
                int cur = nums1[i];
                System.out.println("cur="+cur);
                //找出数组2中比当前数组中最大的数的距离
                if(i< nums2.length) {
                    res = Math.max(getDistance(cur, i, nums2),res);
                }
            }
        return res;
    }
    //暴力方式 超时
    //找最后一个大于当前数组的数
    private int getDistance(int num,int i,int []nums){
        int index =0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]>=num){
                index = Math.max(index,j-i);
                System.out.println("j="+j);
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int []nums1= new int[]{55,30,5,4,2};
        int []nums2 = new int[]{100,20,10,10,5};
        MaxDistance maxDistance = new MaxDistance();
        System.out.println(maxDistance.maxDistance(nums1,nums2));
    }
}
