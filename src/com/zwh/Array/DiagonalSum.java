package com.zwh.Array;

/**
 * @author zwh
 * @date 2022年09月07日 15:04
 * 1572. 矩阵对角线元素的和
 */
public class DiagonalSum {

    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int sum =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
               if(i==j||i+j==m-1){
                   sum +=mat[i][j];
               }
            }
        }
        return sum ;
    }
}
