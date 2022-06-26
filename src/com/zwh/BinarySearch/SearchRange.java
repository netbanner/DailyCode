package com.zwh.BinarySearch;

public class SearchRange {

    public static void main(String[] args) {
        SearchRange sr = new SearchRange();
        int []a = sr.searchRange(new int[]{5,7,7,8,8,10},8);
        System.out.println(a.length);
    }

    public int [] searchRange(int []nums,int target){

        int l =0,r = nums.length-1;
        //分析找目标数第一次出现的最小位置，
        //目标数最后一次出现的位置
        int lmax=0;
        //找出目标数最大的值
        while(l<r){
            int mid = (r-l+1)/2+l;

            if(nums[mid]>target){
                r=mid-1;
            }else {
                l=mid;
            }
        }
        if(l<nums.length&&nums[l]==target){
            lmax = l;
        }else{
            lmax = -1;
        }

        int low = 0,high = nums.length-1;
        //找出最小的值
        while(low<high){
            int mid = (high-low)/2+low;
            if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid;
            }
        }

        int lmin = 0;
        if(low<nums.length&&nums[low]==target){
            lmin = low;
        }else{
            lmin = -1;
        }

        return new int []{lmin,lmax};

    }

}
