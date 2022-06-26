package com.zwh.Array;

import java.util.ArrayList;
import java.util.List;

public class FindClosestElements {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(arr==null||arr.length==0){
            return result;
        }
        //x小于等于数组中最小的数,数组中前k个数
        if(x<=arr[0]){
            for(int i=0;i<k;i++){
                result.add(arr[i]);
            }
        }
        //x大于等于数组中的数
        if(x>=arr[arr.length-1]){
            for(int i=arr.length-k;i<arr.length;i++){
                System.out.println(arr[i]);
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> result =findClosestElements(new int[]{1,2,3,4,5},2,5);
        System.out.println(result);
    }
}
