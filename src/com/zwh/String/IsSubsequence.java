package com.zwh.String;

/**
 * @author zwh
 * @date 2022年06月27日 11:08 PM
 *
 * @desc 392. 判断子序列
 * 输入：s = "abc", t = "ahbgdc"
 * 输出：true
 */
public class IsSubsequence {


    public static void main(String[] args) {
        IsSubsequence is = new IsSubsequence();
        System.out.println(is.isSubsequence("abc","ahbgdca"));
        System.out.println(is.isSubsequence2("abc","ahbgdca"));
    }


        public boolean isSubsequence(String s, String t) {

            // 预处理
            t = " " + t; // 开头加一个空字符作为匹配入口
            int n = t.length();
            int[][] dp = new int[n][26]; // 记录每个位置的下一个ch的位置
            for (char ch = 0; ch < 26; ch++) {
                int p = -1;
                for (int i = n - 1; i >= 0; i--) { // 从后往前记录dp
                    dp[i][ch] = p;
                    if (t.charAt(i) == ch + 'a') p = i;
                }
            }
            System.out.println(dp);
            // 匹配
            int i = 0;
            for (char ch : s.toCharArray()) { // 跳跃遍历
                i = dp[i][ch - 'a'];
                if (i == -1) return false;
            }
            return true;
        }

    public boolean isSubsequence2(String s, String t) {
        int n = s.length(), m = t.length();

        int[][] f = new int[m + 1][26];
        for (int i = 0; i < 26; i++) {
            f[m][i] = m;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a')
                    f[i][j] = i;
                else
                    f[i][j] = f[i + 1][j];
            }
        }
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (f[add][s.charAt(i) - 'a'] == m) {
                return false;
            }
            add = f[add][s.charAt(i) - 'a'] + 1;
        }
        return true;

    }
}




