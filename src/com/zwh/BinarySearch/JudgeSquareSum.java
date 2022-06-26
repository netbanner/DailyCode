package com.zwh.BinarySearch;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 * @Date 2022-06-17
 */
public class JudgeSquareSum {

    public static boolean judgeSquareSum(int n){

        //对于次类问题，固定一个数，二分查找另外一个数，判断这个数与C的大小的

        for(long i=1;i*i<=n;i++){

            long a=i;
            long l=i;
            long h=n;
            while(l<=h){
                long mid =l+(h-l)/2;
                long sum = a*a+mid*mid;
                if(sum<n){
                    l=mid+1;
                }else if(sum==n){
                    return true;
                }else{
                    h =mid-1;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(100000));
        System.out.println(judgeSquareSum2(100000));
    }

    public static boolean judgeSquareSum2(int c) {
        for (long i = 0; i * i <= c; i++) {
            long a = i * i;
            long l = i;
            long r = c;
            while (l <= r) {
                long mid = l + (r - l) / 2;
                long b = mid * mid;
                if (a + b == c) {
                    System.out.println("a="+a+",b="+b);
                    return true;
                } else if (a + b < c) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }
}
