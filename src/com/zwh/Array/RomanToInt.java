package com.zwh.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zwh
 * @date 2022年11月03日 10:15
 * @desc
 */
public class RomanToInt {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('D', 100);
        map.put('M', 1000);
        int num = 0;
        for (int i = 0; i < s.length(); ) {
            char c1 = s.charAt(i);
            char c2 = '0';
            if ((i + 1) < s.length()) {
                c2 = s.charAt(i + 1);
            }
            if (c1 == 'I' && c2 == 'V') {
                num += 4;
                i += 2;
            } else if (c1 == 'I' && c2 == 'X') {
                num += 9;
                i += 2;
            } else if (c1 == 'X' && c2 == 'L') {
                num += 40;
                i += 2;
            } else if (c1 == 'X' && c2 == 'C') {
                num += 90;
                i += 2;
            } else if (c1 == 'C' && c2 == 'D') {
                num += 400;
                i += 2;
            } else if (c1 == 'C' && c2 == 'M') {
                num += 900;
                i += 2;
            } else {
                num += map.get(c1)!=null?map.get(c1).intValue():0;
                i++;
            }


        }
        return num;
    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("DCXXI"));
    }
}
