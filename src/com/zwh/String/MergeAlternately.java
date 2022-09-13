package com.zwh.String;

/**
 * @author zwh
 * @date 2022年09月11日 10:38
 * @desc 1768. 交替合并字符串
 * 输入：word1 = "abc", word2 = "pqr"
 * 输出："apbqcr"
 * 解释：字符串合并情况如下所示：
 * word1：  a   b   c
 * word2：    p   q   r
 * 合并后：  a p b q c r
 *
 */
public class MergeAlternately {

    public static String mergeAlternately(String word1, String word2) {
            StringBuilder sb = new StringBuilder();
        int m = word1.length(),n = word2.length();
        int i=0;
        for(;i<Math.min(m,n);i++){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        while(i<m){
            sb.append(word1.charAt(i++));
        }
        while (i<n){

            sb.append(word2.charAt(i++));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
      //  System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
    }
}
