package com.zwh.June;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 输入：nums = [3, 1, 4, 1, 5], k = 2
 * 输出：2
 * 解释：数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
 * 尽管数组中有两个1，但我们只应返回不同的数对的数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/k-diff-pairs-in-an-array
 */
public class FindPairs {

    public int findPairs(int []nums,int k){
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int low =0,high = list.size()-1;
        int count =0;
        while(low<high){
            int mid = low+(high-low)/2;
            if((list.get(high)-list.get(low)>k)){
                high =mid;
            }else if((list.get(high)-list.get(low))<k){
                low  = mid+1;
            }else{
                count++;
            }
        }

        return count;
    }
}
