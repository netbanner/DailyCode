package com.zwh.June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date 2022-06-12
 * @Hash 表 w->p |p->w
 */
public class FindAndReplacePattern {

    public static void main(String[] args) {
        FindAndReplacePattern findAndReplacePattern = new FindAndReplacePattern();
        List<String> strings =findAndReplacePattern.findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"},"abb");
        System.out.println(strings.get(0));
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (match(word, pattern) && match(pattern, word)) {
                result.add(word);
            }
        }
        return result;

    }

    private boolean match(String s1, String s2) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char x = s1.charAt(i);
            char y = s2.charAt(i);
            if (!map.containsKey(x)) {
                map.put(x, y);
            }else if(map.get(x)!=y){
                return false;
            }

        }


        return true;
    }


}
