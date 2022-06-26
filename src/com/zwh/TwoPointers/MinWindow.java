package com.zwh.TwoPointers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zwh
 * @date 2022年06月23日 7:39 PM
 * @76. 最小覆盖子串
 * <p>
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 */
public class MinWindow {

    public static void main(String[] args) {
        MinWindow minWindow = new MinWindow();
        System.out.println(minWindow.minWindow("ADOBECODEBANC","ABC"));
    }


    public String minWindow(String s, String t) {


        //滑动窗口
        Map<Character, Integer> hs = new HashMap<>();
        //原数组
        Map<Character, Integer> ht = new HashMap<>();

        for (char c : t.toCharArray()) {
            ht.put(c, ht.getOrDefault(c, 0) + 1);
        }
        int i = 0, j = 0, cnt = 0;
        int len =Integer.MAX_VALUE;
        String ans ="";
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            hs.put(c, hs.getOrDefault(c, 0) + 1);
            //记录滑动数组的长度
            if (ht.containsKey(c) && hs.get(c) <= ht.get(c)) {
                cnt++;
            }
            //移动j 判断目标数组中是否包含j
            while (j < i && (!ht.containsKey(s.charAt(j)) || hs.get(s.charAt(j)) > ht.get(s.charAt(j)))) {
                hs.put(s.charAt(j),hs.get(s.charAt(j))-1);
                j++;
            }
            //包含所以t的字符，并比较计算最小长度的字符串
            if(cnt==t.length()&&i-j+1<len){
                len = i-j+1;
                System.out.println("i="+i+",j="+j);
                ans = s.substring(j,i+1);
            }
        }
        return ans;
    }

}
