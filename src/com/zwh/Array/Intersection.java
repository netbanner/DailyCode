package com.zwh.Array;

import java.util.HashSet;

public class Intersection {
    /**
     * 
     * @desc TODO
     * @date 2022/6/20 5:28 PM
 * @param nums1
 * @param nums2
 * @return int[]
     */
    public int [] intersection(int []nums1,int []nums2){

        if(nums1==null||nums2==null){
            return new int[]{};
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }

        for(int i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int []num = new int[set2.size()];
        int j=0;
       for(int s:set2){
           num[j++]=s;
       }

        return num;
    }
}
