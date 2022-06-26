package com.zwh.June;


/**
 * @Date 2022-06-11
 */
public class MinFlipsMonoIncr {

    public int minFlipsMonoIncr(String s){
        int n = s.length();

        //字符串中第i位的字符为0或者1
        int [][]dp= new int[n+1][2];
        dp[0][0]=0;
        dp[0][1]=0;
        //s[i-1]为0，s[i]为0或者1
        //s[i-1]为1，s[i]为1
        //dp[i][0]=dp[i-1][0]+(s[i]=='1'?1:0)
        //dp[i][1]=Maht.min(dp[i-1][0]+dp[i-1][1])+(s[i]=='0'?1:0)
        //result =Math.min(dp[i][0],dp[i][1]);

        char []chars =s.toCharArray();

        for(int i=0;i<n;i++){
            char c= s.charAt(i);
            if(c=='0'){
                dp[i+1][0]=dp[i][0];
                dp[i+1][1] = Math.min(dp[i][0],dp[i][1])+1;
            }else if(c=='1'){
                dp[i+1][0]=dp[i][0]+1;
                dp[i+1][1] = Math.min(dp[i][0],dp[i][1]);
            }
        }
        return Math.min(dp[n][0],dp[n][1]);
    }
}
