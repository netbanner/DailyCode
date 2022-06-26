package com.zwh.June;

/**
 * 统计不同回文子序列
 * @Date 2022-06-10
 */
public class CountPalindromicSubsequences {

    public int countPalindromicSubsequences(String s){
        int mod = 1000000007;
        int n =s.length();
        //dp[i][j]表示字符串[i,j]之间的回文个数
        int [][]dp = new int[n][n];

        //单个字符
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }

        //长度为2的字符串开始
        for(int len=2;len<=n;len++){
            //长度为j的字符串回文数
            for(int i=0;i+len<=n;i++){
                int j=len+i-1;
                //第一个字符和最后一个字符相等
                if(s.charAt(i)==s.charAt(j)){
                    int left = i+1;
                    int right = j-1;
                    //找到第一个和s[i]相同的字符
                    while (left<=right&&s.charAt(left)!=s.charAt(i)){
                        left++;
                    }
                    //找到第一个和s[j]相等的字符
                    while (left<=right&&s.charAt(right)!=s.charAt(j)){
                        right--;
                    }
                    if(left>right){
                        //没重复的数
                        dp[i][j] = 2*dp[i+1][j-1]+2;
                    }else if(left==right){
                        //重复一次
                        dp[i][j] = 2*dp[i+1][j-1]+1;
                    }else{
                        //重复多次
                        dp[i][j] =2*dp[i+1][j-1]-dp[left+1][right-1];
                    }
                }else{
                    //不相等
                    dp[i][j]=dp[i][j-1]+dp[i+1][j]-dp[i+1][j-1];
                }
                //处理超范围结果
                dp[i][j] =(dp[i][j]>=0)?dp[i][j]%mod:dp[i][j]+mod;
            }
        }

        return dp[0][n-1];
    }
}
