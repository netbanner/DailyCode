package com.zwh.June;

/**
 * 给定一个正整数 n，返回 连续正整数满足所有数字之和为 n 的组数 。
 * 题目：829
 * @Date 2022-06-03
 * 分析：
 * 1.将 n 表示成 k 个连续的正整数之和。
 * 2.设第一个数为x，连续的k个数之和为x+(x+1)+ ... + (x+k-1) = k * x + (1+2+...+k-1) = k * x + k(k-1)/2。
 * 3.n=k*x+k(k-1)/2(x>=1,k>=1)
 * 4.假设整数段[i,j]的和为n，那么必然有(i + j) * (j - i + 1) == 2 * n。
 *
 * 其中j - i + 1就是整数段的长度x，而i + j显然是大于j - i + 1的，因此就有x * x < 2 * n，也就是整数段的长度一定小于(2 * n) ^ 0.5，这个数据范围是我们能够接受的。
 *
 * 至于如何判断是否存在长度为x的连续整数段，只需要解一个方程组即可：
 *
 * (i + j) * (j - i + 1) == 2 * n
 *
 * j - i + 1 == x
 * j = x+i-1;
 */
public class ConsecutiveNumbersSum {

    public int consecutiveNumbersSum(int n){
        int res=0;
        for(int x=1;x<Math.sqrt((n*2));x++){
            //x个连续的整数
            int i = ((2*n)/x+1-x)/2;
            //所以整数之和
            if((i+x+i-1)*x==2*n){
                res++;
            }
        }

        return res;
    }
}
