package com.zwh.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zwh
 * @date 2022年09月11日 15:29
 *
 * @desc 1356. 根据数字二进制下 1 的数目排序
 */
public class SortByBits {

    public int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int x:arr){
            list.add(x);
        }

        int []bit = new int[10001];

        for(int i=1;i<=10000;i++){
            bit[i] = bit[i>>1]+(i&1);
        }

        Collections.sort(list, (o1, o2) -> {
            if(bit[o1]!=bit[o2]){
                return bit[o1]-bit[o2];
            }else{
                return  o1-o2;
            }
        });

        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
