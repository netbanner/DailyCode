package com.zwh.BinarySearch.two;

/**
 * @author zwh
 * @date 2022年06月21日 7:49 PM
 * @desc 300. 最长递增子序列
 * 思路与算法
 * <p>
 * 定义 dp[i] 为考虑前 i 个元素，以第 i 个数字结尾的最长上升子序列的长度，注意nums[i] 必须被选取。
 * <p>
 * 我们从小到大计算 dp 数组的值，在计算 dp[i] 之前，我们已经计算出 dp[0…i−1] 的值，则状态转移方程为：
 * <p>
 * dp[i] = max(dp[j]+1,其他0<=j<i，nums[j]<nums[i]
 */

public class LengthOfLIS {

    public static void main(String[] args) {
        LengthOfLIS lengthOfLIS = new LengthOfLIS();

        System.out.println(lengthOfLIS.lengthOfLIS(new int[]{10,9,2,5,3,7,101}));
    }

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int []dp = new int[nums.length];

        dp[0]=1;
        int maxLength =1;
        for(int i=1;i<nums.length;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxLength = Math.max(maxLength,dp[i]);
        }

        return maxLength;
    }


}
