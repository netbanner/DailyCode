package com.zwh.June;

/**
 * @author zwh
 * @date 2022年06月27日 10:57 PM
 * @desc 522. 最长特殊序列 II
 */
public class FindLUSlength {

    public int findLUSlength(String []strs){
        int n = strs.length;

        int ans = -1;
        for(int i=0;i<n;i++){
            boolean check = true;
            for(int j=0;j<n;j++){
                if(i!=j&&isSubString(strs[i],strs[j])){
                    check = false;
                    break;
                }
            }
            if(check){
                ans = Math.max(ans,strs[i].length());
            }
        }


        return ans;
    }

    private boolean isSubString(String s1,String s2){
        int i=0,j=0;
        while (i<s1.length()&&j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                ++i;
            }
            ++j;
        }
        return i==s1.length();
    }
}
