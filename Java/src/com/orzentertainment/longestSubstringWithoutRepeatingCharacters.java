package com.orzentertainment;


import java.util.*;

public class longestSubstringWithoutRepeatingCharacters {

    int result = 0;

    public longestSubstringWithoutRepeatingCharacters(String input){
        int counter = 0;
        int currentMax = 0;
        Map<Character, Integer>map = new HashMap<>();
        for(int i=0; i<input.length(); i++){
            char current = input.charAt(i);
            if(map.containsKey(current)){
                if(currentMax <= counter){
                    currentMax = counter;
                }
                map.clear();
                counter = 1;
                map.put(current, 1);
            }else{
                map.put(current, 1);
                counter++;
            }
            if(i == input.length()-1 && counter>=currentMax)
                currentMax = counter;
            System.out.print(counter);
            System.out.println(current);

        }
        this.result = currentMax;


    }


}
