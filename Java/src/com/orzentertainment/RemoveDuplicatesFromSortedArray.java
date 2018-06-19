package com.orzentertainment;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] num){
        if(num == null || num.length ==0){
            return 0;
        }
        int current = num[0];
        int count = 1;
        for(int i = 0; i<num.length; i++){
            if(num[i] != current){
                current = num[i];
                num[count] = num[i];
                num[i] = current;
                count++;
            }
        }

        return count;
    }
}
