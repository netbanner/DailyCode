package com.zwh.dp;

public class Rob2 {

    public static void main(String[] args) {
        Rob2 rob2 = new Rob2();
        System.out.println(rob2.rob(new int[]{2,3,2}));
    }
    public int rob(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        //0~nums.length-2;
        int nums1[] = new int[nums.length-1];
        //1~nums.length-1;
        int nums2[] = new int[nums.length-1];
        nums1[0]=nums[0];

        for(int i=1,j=0;i<nums.length-1;i++){
            nums2[j++] =nums[i];
            nums1[i] = nums[i];
        }
        nums2[nums.length-2] = nums[nums.length-1];
        int r1 =rob2(nums1);
        int r2 = rob2(nums2);
        System.out.println("r1="+r1+",r2="+r2);
        return Math.max(rob2(nums1),rob2(nums2) );
    }

    private  int rob2(int[] nums) {
        int []dp = new int[nums.length+1];
        dp[0]= nums[0];
        if(nums.length==1){
            return dp[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }

        return dp[nums.length-1];
    }
}
