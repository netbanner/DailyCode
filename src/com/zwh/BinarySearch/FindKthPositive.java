package com.zwh.BinarySearch;

public class FindKthPositive {

    public int findKthPositive(int []arr,int k){
        //找出数组中刚好第k大的数
        int max = arr[arr.length-1];
        boolean []b = new boolean[max+k+1];
        b[0] = false;
        for(int a:arr){
            b[a] = true;
        }
        int temp=1;
        for(int i=1,j=1;i<b.length;i++){
            if(!b[i]&&j<=k){
                j++;
                temp =i;
                System.out.println("temp="+temp);
            }

        }
        if(temp==max){
            temp= temp+k;
        }

        return temp;
    }

    public static void main(String[] args) {
        FindKthPositive fk = new FindKthPositive();
        int n = fk.findKthPositive(new int[]{2,3,4,7,11},5);
        System.out.println(n);
    }
}
