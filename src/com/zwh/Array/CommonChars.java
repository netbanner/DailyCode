package com.zwh.Array;

import java.util.*;

/**
 *
 */
public class CommonChars {
    public static void main(String[] args) {
        CommonChars commonChars = new CommonChars();
        System.out.println(commonChars.commonChars(new String []{"bella","label","roller"}))    ;
    }

    public List<String> commonChars(String []words){
        List<String> result = new ArrayList<>();
        Set<Character> set  = new HashSet<>();
        for(char c:words[0].toCharArray()){
            set.add(c);
        }

        for(int i=1;i<words.length;i++){
            char []word = words[i].toCharArray();
            Set<Character> set1 = new HashSet<>();
            for(char c:word){
                if(set.contains(c)){
                    set1.add(c);
                }
            }
            set = set1;
        }
        for(char c:set){
            result.add(String.valueOf(c));
        }

        return result;
    }
}
