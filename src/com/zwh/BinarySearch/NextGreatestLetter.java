package com.zwh.BinarySearch;

//744. 寻找比目标字母大的最小字母
public class NextGreatestLetter {

    //letters = ["c", "f", "j"]，target = "a"
    public char nextGreatestLetter(char []letters,char target){

        int l =0,r = letters.length-1;

        while (l<r){
            int mid = l+(r-l)/2;
            if(letters[mid]<target){
                l=mid+1;
            }else {
                r=mid;
            }
        }

        return letters[l];
    }


    public char get(char []letters,char target){
        int length = letters.length;
        if (target >= letters[length - 1]) {
            return letters[0];
        }
        int low = 0, high = length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (letters[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return letters[low];


    }

    public static void main(String[] args) {
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        System.out.println(nextGreatestLetter.nextGreatestLetter(new char[]{'c','f','j'},'a'));
    }
}
