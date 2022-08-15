package com.zwh.July;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwh
 * @date 2022年07月08日 07:56
 */
public class ReplaceWords {

    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0,j=0;i<sentence.length();i++){
            while(j<sentence.length()&&sentence.charAt(j)!=' '){
                j++;
                continue;
            }
            System.out.println(j);
            String word = sentence.substring(i,j);
            i=j;
            j=i+1;
           System.out.println("word="+word);
           for(String dic:dictionary){
               if(word.startsWith(dic)){
                   word= dic;
                   continue;
               }
           }
           stringBuilder.append(word).append(' ');

        }
        return stringBuilder.substring(0,stringBuilder.length()-1);
    }

    public static void main(String[] args) {
        List<String> dictonary = new ArrayList<>();
        dictonary.add("cat");
        dictonary.add("bat");
        dictonary.add("rat");

        ReplaceWords rw = new ReplaceWords();
        System.out.println(rw.replaceWords(dictonary,"the cattle was rattled by the battery"));
    }
}
