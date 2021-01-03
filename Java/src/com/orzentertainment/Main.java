package com.orzentertainment;

public class Main {

    public static void main(String[] args) {
       SearchInsertPosition si = new SearchInsertPosition();
       int[] arr = {1,3,5,6};
       int target = 7;
        System.out.println(si.searchInsert(arr, target));
    }

}
