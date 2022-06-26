package com.zwh.BinarySearch.two;

/**
 * @author zwh
 * @date 2022年06月24日 8:05 PM
 */
public class MaximumRemovals {

    public int maximumRemovals(String s,String n,int []removable){
        if(s==null||s.length()==0){
            return -1;
        }
        if(n==null||n.length()==0){
            return removable.length;
        }

        int l=0,r = removable.length-1;
        while (l<r){
            int mid=(l+r)>>1;

            if(!remove(s,n,mid,removable)){
                r =mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }

     private boolean remove(String s,String p,int mid,int []removable){
        char []chars = s.toCharArray();
         for(int i=0;i<=mid;i++){
             int index = removable[i];
             chars[index]='-';
         }
         StringBuilder stringBuilder = new StringBuilder();
         for(char c:chars){
             if(c!='-'){
                 stringBuilder.append(c);
             }
         }

         return  stringBuilder.toString().contains(p);

     }
}
