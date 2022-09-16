package com.zwh.String;

/**
 * @author zwh
 * @date 2022年09月16日 14:13
 *
 * 383. 赎金信
 *
 * 输入：ransomNote = "aa", magazine = "ab"
 * 输出：false
 *
 * 输入：ransomNote = "aa", magazine = "aab"
 * 输出：true
 */
public class CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        int []chars = new int[26];

        for(int i=0;i<magazine.length();i++){
            chars[magazine.charAt(i)-'a']++;
        }

        for(int j=0;j<ransomNote.length();j++){
            int i = ransomNote.charAt(j) - 'a';
             chars[i]--;
            if(chars[i]<0){
                return false;
            }
        }


        return true;
    }
}
