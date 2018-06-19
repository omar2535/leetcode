package com.orzentertainment;

public class Main {

    public static void main(String[] args) {
       RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
       int nums[] = {1,2};
       int length = rd.removeDuplicates(nums);
       for(int i = 0; i<nums.length; i++){
           System.out.println(nums[i]);
       }
    }

}
