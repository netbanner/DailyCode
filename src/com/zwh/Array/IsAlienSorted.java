package com.zwh.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zwh
 * @date 2022年09月11日 09:21
 * @desc
 * 输入：words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * 输出：true
 * 解释：在该语言的字母表中，'h' 位于 'l' 之前，所以单词序列是按字典序排列的。
 *
 * 953. 验证外星语词典
 */
public class IsAlienSorted {

    public boolean isAlienSorted(String []words,String order){
        Map<Character,Integer> orderMap = new HashMap<>();
        for(int i=0;i<order.length();i++){
            orderMap.put(order.charAt(i),i);
        }
        for(int j=0;j<words.length-1;++j){
            String pre = words[j];
            String cur = words[j+1];
            boolean smaller = false;
            for(int h=0;h<Math.min(pre.length(),cur.length());++h){
                if(orderMap.get(pre.charAt(h))<orderMap.get(cur.charAt(h))){
                    smaller=true;
                    break;
                }else if(orderMap.get(pre.charAt(h))>orderMap.get(cur.charAt(h))){
                    return false;
                }
            }
            if(!smaller&&pre.length()>cur.length()){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsAlienSorted isAlienSorted = new IsAlienSorted();
        System.out.println(isAlienSorted.isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz"));
    }
}
