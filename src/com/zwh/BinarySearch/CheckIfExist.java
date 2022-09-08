package com.zwh.BinarySearch;

import java.util.Arrays;

public class CheckIfExist {

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int []{-10,12,-20,-8,15}));

    }

    public static boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length == 0) return false;
        Arrays.sort(arr);
        int len = arr.length;
        int pointer = 0;
        int num;
        for (int i = 0; i < len; i++) {
            num = arr[i] * 2;
            while (pointer < len && num > arr[pointer]) pointer++;
            if(pointer < len && pointer != i && num == arr[pointer]) return true;
            else if(pointer == len) break;
        }
        return false;

    }

}
