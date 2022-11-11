package com.zwh.Array;

/**
 * @author zwh
 * @date 2022年10月04日 17:07
 * @desc 169.多数元素
 */
public class MajorityElement {


    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();

       int a = majorityElement.majorityElement(new int[]{2,2,1,1,1,2,2});
        System.out.println(a);
    }

   /**
    *
    * Boyer-Moore 算法
    * @date 2022/10/4 17:25
    * @param nums
    * @return int
    */
    public int majorityElement(int []nums){
       int count =0;
       //候选人
       Integer candidate = null;

       for(int num:nums){
           if(count==0){
               candidate = num;
           }

           count +=(candidate==num)?1:-1;
       }


        return candidate.intValue() ;
    }
}
