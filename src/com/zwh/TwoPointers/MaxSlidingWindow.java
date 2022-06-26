package com.zwh.TwoPointers;

/**
 * @author zwh
 * @date 2022年06月23日 8:31 PM
 */
public class MaxSlidingWindow {

    public static void main(String[] args) {
        MaxSlidingWindow mw = new MaxSlidingWindow();
        System.out.println(mw.maxSlidingWindow(new int[]{1,-1},1).length);
        System.out.println(mw.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3).length);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        if(k==1){
            return nums;
        }
        int []t = new int[nums.length-k+1];
        int max=nums[0];
        int l=0;
        while(l+k<=nums.length){
            int temp = max;
            for(int j=0;j<k;j++){
                temp= Math.max(temp,nums[l+j]);
            }
            t[l] = temp;
            System.out.println("temp="+temp);
            l++;
        }

        return t;
    }
}
