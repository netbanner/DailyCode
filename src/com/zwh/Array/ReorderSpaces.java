package com.zwh.Array;

import java.util.List;

/**
 * @author zwh
 * @date 2022年09月07日 15:25
 *
 * @desc 1592
 */
public class ReorderSpaces {

        //text = "  this   is  a sentence "
        //"this   is   a   sentence"
    public String reorderSpaces(String text) {

        char []chars = text.toCharArray();
        int spaceNum =0,wordNum=0,j=0;
        for(int i=0;i<chars.length;i++){

        if(chars[i]==' '){
            spaceNum++;
        }
        while(j<chars.length&&chars[j]==' '){
            j++;
        }

        }



        return new String(chars);


    }

}
