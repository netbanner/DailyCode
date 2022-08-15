package com.zwh.BinarySearch.two;

import java.util.Arrays;

/**
 * @author zwh
 * @date 2022年06月28日 3:16 PM
 *
 * @desc 1838. 最高频元素的频数
 *
 * 先对原数组 nums 进行从小到大排序，如果存在真实最优解 len，意味着至少存在一个大小为 len的区间 [l, r]，使得在操作次数不超过 k 的前提下，
 * 区间 [l, r] 的任意值 nums[i] 的值调整为 nums[r]。
 *
 * 这引导我们利用「数组有序」&「前缀和」快速判断「某个区间 [l, r] 是否可以在 k次操作内将所有值变为 nums[r]：
 *
 *
 */
public class MaxFrequency {

    public int maxFrequency(int []nums,int k){

        int n = nums.length;
        Arrays.sort(nums);
       int l=0,r= n;
       int []sum = new int[n+1];

       for(int i=1;i<=n;i++){
           sum[i]=sum[i-1]+nums[i-1];
       }
       while (l<r){
           int mid=1+r+l>>1;

           if(check(mid,nums,sum,k)){
               l = mid;
           }else{
               r = mid-1;
           }
            return r;
       }


        return k;
    }

    boolean check(int len,int []nums,int []sum,int k){
        for(int l=0;l+len-1<nums.length;l++){
            int r= len+l-1;
            int cur = sum[r+1]-sum[l];
            int t= nums[r]*len;
            if(t-cur<=k){
                return true;
            }
        }
        return false;
    }

}
