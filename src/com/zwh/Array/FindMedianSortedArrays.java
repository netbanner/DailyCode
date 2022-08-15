package com.zwh.Array;

/**
 * @author zwh
 * @date 2022年08月09日 14:07
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        System.out.println(findMedianSortedArrays(new int[]{3},new int[]{-2,-1}));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0d;
        int len1 = nums1.length;
        int len2 = nums2.length;
        int []num = new int[len1+len2];
        int i=0,j=0,k=0;
        while(i<len1||j<len2){
            if(i<len1&&j<len2&&nums1[i]<nums2[j]){
                num[k++]=nums1[i];
                i++;
            }else{
                num[k++]=nums2[j];
                j++;
            }
            if(i<len1){
                num[k++]=nums1[i++];
            }
            if(j<len2){
                num[k++]=nums2[j++];
            }

        }
        if(k%2==0){
            res = (num[k/2]+num[k/2-1])/2.0;
        }else{
            res = num[k/2];
        }
        return res;
    }
}
