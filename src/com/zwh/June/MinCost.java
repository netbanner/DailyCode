package com.zwh.June;

/**
 * @author zwh
 * @date 2022年06月25日 10:39 AM
 * @desc 剑指 Offer II 091. 粉刷房子
 */
public class MinCost {


    public int minCost(int[][] costs) {
        int dp[][] =new int[costs.length+1][3];
       // dp[i] = dp[i-1]+Math.min(costs[i][0],cost[i][1],cost[i,2]);
        dp[0][0]=0;
        dp[0][1]=0;
        dp[0][2]=0;
        for(int i=1;i<costs.length;i++){
            dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+costs[i-1][0];
            dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+costs[i-1][1];
            dp[i][2]=Math.min(dp[i-1][0],dp[i-1][1])+costs[i-1][2];
        }

        return Math.min(Math.min(dp[costs.length][0],dp[costs.length][1]),dp[costs.length][2]);
    }
}
