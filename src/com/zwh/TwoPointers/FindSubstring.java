package com.zwh.TwoPointers;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zwh
 * @date 2022年06月23日 9:08 PM
 *
 * 输入：s = "barfoothefoobarman", words = ["foo","bar"]
 * 输出：[0,9]
 * 解释：
 * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 *
 */
public class FindSubstring {


    //s = "barfoothefoobarman", words = ["foo","bar"]
    public List<Integer> findSubstring(String s,String []words){
        List<Integer> result = new ArrayList<>();

        Map<Character,Integer> hs = new HashMap<>();

        Map<String,Map<Character,Integer>> wordMap = new HashMap();

        for(String word:words){
            Map<Character,Integer> map = new HashMap<>();
            for(char c:word.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            wordMap.put(word,map);

        }

        int i=0,j=0,cnt=0;
        //s = "barfoothefoobarman", words = ["foo","bar"]
        for(String w: wordMap.keySet()) {
             int t = s.indexOf(w);
             wordMap.remove(w);


        }


        return result;
    }
}
