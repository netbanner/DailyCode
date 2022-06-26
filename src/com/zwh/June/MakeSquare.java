package com.zwh.June;

import java.util.Arrays;

/**
 * 你将得到一个整数数组 matchsticks ，其中 matchsticks[i] 是第 i 个火柴棒的长度。你要用 所有的火柴棍 拼成一个正方形。
 * 你 不能折断 任何一根火柴棒，但你可以把它们连在一起，而且每根火柴棒必须 使用一次 。
 *
 * 如果你能使这个正方形，则返回 true ，否则返回 false 。
 *
 * 题目：473火柴拼正方形
 * @Date 2022-06-02 补
 */
public class MakeSquare {

    public  boolean makeSquare(int []matchsticks){

        //计算总长度
        int total = 0;
        for (int i:matchsticks){
            total +=i;
        }
        if(total%4!=0){
            return false;
        }
        //每条边长度
        int edge = total/4;
        //排序
        Arrays.sort(matchsticks);
        for(int i=0,j=matchsticks.length-1;i<j;i++,j--){
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }

        int []edges = new int[4];



        return dfs(0,matchsticks,edges,edge);
    }

    private boolean dfs(int index,int[]matchsticks,int []edges,int len){
        if(index==matchsticks.length){
            return true;
        }
        for(int i=0;i<edges.length;i++){
            edges[i] += matchsticks[index];
            if(edges[i]<=len&&dfs(index+1,matchsticks,edges,len)){
                return true;
            }
            edges[i] -=matchsticks[index];
        }

        return false;
    }

    public static void main(String[] args) {
        MakeSquare makeSquare = new MakeSquare();
        System.out.println(makeSquare.makeSquare(new int[] {1,1,2,2,2}));
    }
}
