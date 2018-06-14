package com.orzentertainment;

import java.util.ArrayList;

public class PalindromeNumber {
    public boolean isPalindrome(int input){

        if(input < 0){
            return false;
        }
        System.out.println(input);
        int counter = 0;
        int copy = input;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int reversed = 0;

        while(copy/10 !=0 || copy%10!=0){
            arr.add(copy%10);
            copy = copy/10;
            counter++;
        }

        for(int i=0; i<arr.size(); i++){
            System.out.println("At index " + i + ": " + arr.get(i));
        }
        while(counter >0){
            System.out.println("Number being added: " + (int)(arr.get(arr.size()-counter)*Math.pow(10, counter-1)));
            reversed = reversed + (int)(arr.get(arr.size()-counter)*Math.pow(10, counter-1));
            System.out.println(reversed);
            counter--;
        }
        return reversed==input;

    }

}
