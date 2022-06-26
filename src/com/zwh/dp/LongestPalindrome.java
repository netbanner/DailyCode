package com.zwh.dp;

/**
 * @author zwh
 * @date 2022年06月26日 3:01 PM
 * @desc 最长回文串
 */

public class LongestPalindrome {

    public static void main(String[] args) {

    }


    /**
     *
     * @desc 动态规划 [i,j]为回文,[i+1,j-]也是回文 ,bb |bab这三种情况都是回文
     * @date 2022/6/26 3:30 PM
     * @param s
     * @return java.lang.String
     */
    public String longestPalindrome(String s){
        int len = s.length();
        if(len<2){
            return s;
        }
        int maxLen =1;
        int begin=0;
        int end =0;
        //表示从[i,j]是否时回文串
        boolean [][]dp = new boolean[len][len];

        for(int i=0;i<len;i++){
            dp[i][i] = true;
        }
        for(int j=1;j<len;j++){
            for(int i=0;i<j;j++){
                if(s.charAt(i)==s.charAt(j)&&(j-i<=2)||s.charAt(i+1)==s.charAt(j-1)){
                    dp[i][j]= true;
                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        begin = i;
                        end = j;
                    }
                }
            }
        }


        return s.substring(begin,end+1);
    }
}
