package com.zwh.BinarySearch.two;

import java.util.Arrays;

/**
 * @author zwh
 * @date 2022年06月25日 6:35 PM
 * @desc; 1818. 绝对差值和
 * 输入：nums1 = [1,7,5], nums2 = [2,3,5]
 * 输出：3
 * 解释：有两种可能的最优方案：
 * - 将第二个元素替换为第一个元素：[1,7,5] => [1,1,5] ，或者
 * - 将第二个元素替换为第三个元素：[1,7,5] => [1,5,5]
 * 两种方案的绝对差值和都是 |1-2| + (|1-3| 或者 |5-3|) + |5-5| = 3
 *
 *
 * 分析：
 * 这是一道二分陈题，具体做法如下：
 *
 * 我们在进行处理前，先对 nums1进行拷贝并排序，得到 sorted 数组。
 *
 * 然后 在遍历 nums1 和 nums2 计算总的差值 sum 时，通过对 sorted 进行二分查找，找到最合适替换 nums[i] 的值。
 *
 * 具体的，当我们处理到第 i 位时，假设该位的原差值为 x = abs(nums1[i] - nums2[i])，然后从 sorted数组中通过二分找到最接近 nums2[i]的值，计算一个新的差值 nd
 * （注意要检查分割点与分割点的下一位），如果满足 nd < x 说明存在一个替换方案使得差值变小，我们使用变量 max记下来这个替换方案所带来的变化，并不断更新 max。
 *
 * 当整个数组被处理完，max 存储着最优方案对应的差值变化，此时 sum - max 即是答案。
 */
public class MinAbsoluteSumDiff {


    public int minAbsoluteSumDiff(int []num1,int []num2)
    {
        int mod = (int)1e9+7;
        int []num = num1.clone();
        int n = num1.length;
        Arrays.sort(num);
        long sum=0,max=0;
        for(int i=0;i<n;i++){
            int a = num1[i],b=num2[i];
            int x = Math.abs(a-b);
            sum +=x;
            int l=0,r=n-1;
            //求数组num中最接近num2[i]的数
            while (l<r){
                int mid = (l+r+1)>>1;
                if(num[mid]>b){
                    r=mid-1;
                }else{
                    l =mid;
                }
            }
            int nd = Math.abs(num[r]-b);
            if(r+1<n){
                nd = Math.min(nd,num[r+1]-b);
            }
            if(nd<x) {
                max = Math.max(max,x-nd);
            }

        }
        return (int)(sum-max)%mod;
    }
}
