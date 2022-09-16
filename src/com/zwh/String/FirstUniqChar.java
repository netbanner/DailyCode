package com.zwh.String;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zwh
 * @date 2022年09月16日 14:02
 * @desc 387. 字符串中的第一个唯一字符
 *
 * s = "leetcode"
 * 0
 */
public class FirstUniqChar {


    public int firstUniqChar(String s){
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }



}
