package com.zwh.June;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String email:emails){
            String s[]=email.split("@");
            String t[]=s[0].split("\\+");
            t[0]=t[0].replaceAll("\\.","");
            set.add(new StringBuilder(t[0]).append("#").append(s[1]).toString());
            Math.min(1,2);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String []strings = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        NumUniqueEmails numUniqueEmails = new NumUniqueEmails();
        System.out.println(numUniqueEmails.numUniqueEmails(strings));

    }
}
