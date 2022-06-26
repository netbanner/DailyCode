package com.zwh.BinarySearch.two;

import java.util.Arrays;

/**
 * @author zwh
 * @date 2022年06月22日 11:02 PM
 * @desc 1552. 两球之间的磁力
 * 输入：position = [1,2,3,4,7], m = 3
 * 输出：3
 * 解释：将 3 个球分别放入位于 1，4 和 7 的三个篮子，两球间的磁力分别为 [3, 3, 6]。最小磁力为 3 。我们没办法让最小磁力大于 3 。
 *
 */
public class MaxDistance {


    public int maxDistance(int [] position,int m){
        Arrays.sort(position);
        int l=0,r = position[position.length-1];
        while(l<r){
            int mid =(l+r+1)>>1;
            if(check(mid,position,m)){
                l =mid;
            }else{
                r = mid-1;
            }
        }
        return 1;
    }
    /*
     *
     * @desc 判断距离为f时能放的最多的球
     * @date 2022/6/22 11:09 PM
     * @param f 两球距离
     * @param position
     * @param m
     * @return boolean
     */
    private boolean check(int f,int []position,int m){

        int pre = position[0];
        int cnt =1;
        for(int i=1;i<position.length;i++){
            if(position[i]-pre>=f){
                ++cnt;
                pre = position[i];
            }
        }

        return cnt>=m;
    }
}
