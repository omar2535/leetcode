package com.orzentertainment;

import java.util.HashMap;

public class LongestPalindrome {




        public int  longestPalindrome(String s){
                HashMap<Character, Integer> characterSet = new HashMap<>();
                int count = 0;
                if(s.length() == 1)
                        return 1;
                for(int i=0; i<s.length(); i++){
                        char currentChar = s.charAt(i);
                        if(characterSet.containsKey(currentChar)){
                                characterSet.put(currentChar, characterSet.get(currentChar) + 1);
                        }else{
                                characterSet.put(currentChar, 1);
                        }
                        if(characterSet.get(currentChar) % 2 == 0){
                                count+=2;
                        }
                }
                for(int i=0; i<s.length(); i++){
                        char currentChar = s.charAt(i);
                        if(characterSet.get(currentChar) % 2 == 1){
                                count++;
                                break;
                        }
                }

                return count;
        }
}
