package com.zwh.BinarySearch;

public class FindTheDistanceValue {

    public static void main(String[] args) {
        int []arr1 = new int[]{1,4,2,3};
        int []arr2 = new int[]{-4,-3,6,10,20,30};
        FindTheDistanceValue findTheDistanceValue = new FindTheDistanceValue();
        System.out.println(findTheDistanceValue.findTheDistanceValue(arr1,arr2,3));
    }

    public  int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res =0;
        //   arr2[j]-d<=arr1[i]<=arr2[j]+d;
        //     arr1[i]-d<=arr2[j]<=arr1[i]+d;
        //判断数组2是否在【arr2
        for(int i=0;i<arr1.length;i++){
            int l=arr1[i]-d;
            int r=arr1[i]+d;
            int t =0;
            for(int j=0;j<arr2.length;j++){
                if(judge(l,r,arr2[j])){
                    t++;
                }
            }
            if(t==0){
                res++;
            }

        }
        return res;
    }
    private  boolean judge(int l,int r,int x){
        while (l<=r){
            int mid = l+(r-l)/2;
            if(mid==x){
                return true;
            }else if(mid<x){
                l=mid+1;
            }else{
                r = mid-1;
            }
        }
        return false;
    }
}
