package com.zwh.BinarySearch;

/**
 * 给你一个长度固定的整数数组arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 *
 * 注意：请不要在超过该数组长度的位置写入元素。
 *
 * 要求：请对输入的数组就地进行上述修改，不要从函数返回任何东西。
 *
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 *
 * @Date 2022-06-17
 * @Desc 1089
 */
public class DuplicateZeros {
    public static void main(String[] args) {
      duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length, i = 0, j = 0;
        while (j < n) {
            if (arr[i] == 0) j++;
            i++; j++;
        }
        System.out.println("i="+i+",j="+j);
        i--; j--;
        System.out.println("i="+i+",j="+j);
        while (i >= 0) {
            if (j < n) arr[j] = arr[i];
            if (arr[i] == 0 && --j >= 0) arr[j] = 0;
            i--; j--;
        }
    }



}
