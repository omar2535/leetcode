package com.orzentertainment;

import java.util.HashMap;

public class RomanToInteger {
    //Returns integer from roman numeral string
    public int romanToInt(String s) {

        HashMap<String, Integer> pairs = new HashMap<>();
        pairs.put("I", 1);
        pairs.put("V", 5);
        pairs.put("X", 10);
        pairs.put("L", 50);
        pairs.put("C", 100);
        pairs.put("D", 500);
        pairs.put("M", 1000);

        int accumulator = 0;

        int prev = 0;
        for(int i=0; i<s.length(); i++){
            String current = s.charAt(i) + "";
            int currentVal = pairs.get(current);
            if(prev < currentVal){
                currentVal -= prev;
                accumulator -= prev;
            }
            prev = pairs.get(s.charAt(i) + "");
            accumulator += currentVal;
        }

        return accumulator;
    }

}
