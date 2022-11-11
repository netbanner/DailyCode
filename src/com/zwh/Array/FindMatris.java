package com.zwh.Array;

/**
 * @author zwh
 * @date 2022年10月18日 10:06
 * @desc 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 * Consider the following matrix:
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * <p>
 * Given target = 5, return true.
 * Given target = 20, return false.
 */
public class FindMatris {

    public boolean find(int[][] matris,int target) {

        int rows = matris.length, cols = matris[0].length;
        if (matris == null || matris.length == 0 || matris[0].length == 0) {
            return false;
        }
        int r = 0, c = cols - 1;
        while (r < rows && c >= 0) {
            if(matris[r][c]==target){
                return true;
            }else if(target>matris[r][c]){
                r++;
            }else{
                c--;
            }

        }

        return false;
    }
}
