package com.zwh.Array;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author zwh
 * @date 2022年08月09日 17:26
 */
public class FindKthLargest {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
    }

    public static int findKthLargest(int []nums,int k) {
        if(k>nums.length){
            return -1;
        }

        PriorityQueue<Integer> head = new PriorityQueue<>(Comparator.comparingInt(n -> n));

        for(int num:nums){
            head.add(num);
            if(head.size()>k){
                head.poll();
            }
        }
        return head.poll();
    }


}
