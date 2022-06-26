package com.zwh.BinarySearch.two;

/**
 * @author zwh
 * @date 2022年06月24日 6:44 PM
 * @desc 287.寻找重复数
 *
 *
 * 给定一个包含n + 1 个整数的数组nums ，其数字都在[1, n]范围内（包括 1 和 n），可知至少存在一个重复的整数。
 *
 * 假设 nums 只有 一个重复的整数 ，返回这个重复的数 。
 *
 * 你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间。
 *              0 1 2 3 4
 * 输入：nums = [3,1,3,4,2]
 * 输出：3
 *
 * 分析：二分查找」的思路是先猜一个数（搜索范围 [left..right] 里位于中间的数 mid），然后统计原始数组中 小于等于 mid 的元素的个数 count：
 *
 * 如果 count 严格大于 mid。根据 抽屉原理，重复元素就在区间 [left..mid] 里；
 * 否则，重复元素可以在区间 [mid + 1..right] 里找到，其实只要第 1 点是对的，这里肯定是对的，但要说明这一点，需要一些推导，我们放在最后说。
 */
public class FindDuplicate {
    /**
     *
     * @desc 数组中
     * @date 2022/6/24 7:14 PM
     * @param nums
     * @return int
     */
    public int findDuplicate(int []nums){
            int len = nums.length;
            int l=1,r = len-1;
            while (l<r){
                int mid = (l+r)>>1;

                int count=0;
                //统计小于等于mid的个数
                for(int num:nums){
                    if(num<=mid){
                        count++;
                    }
                }
                //小于等于中间数的个数，[l,mid]
                if(count>mid){
                    r=mid;
                }else{
                    l = mid+1;
                }
            }

            return l;
        }
}
