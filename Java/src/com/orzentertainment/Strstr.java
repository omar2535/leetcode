package com.orzentertainment;

public class Strstr {

    public int strStr(String haystack, String needle) {
        int index = -1;
        if(needle.length() == 0){
            return 0;
        }

        for(int i=0; i<haystack.length(); i++){
            char current = haystack.charAt(i);
            if(current == needle.charAt(0)){
                boolean isIn = true;
                for(int j=0; j<needle.length(); j++){
                    char currentNeedle = needle.charAt(j);

                    if(!(i+j < haystack.length())){
                        isIn = false;
                        break;
                    }else{
                        char currentHaystack = haystack.charAt(i+j);
                        if(currentNeedle != currentHaystack){
                            isIn = false;
                            break;
                        }
                    }
                }
                if(isIn){
                    index = i;
                    break;
                }
            }
        }

        return index;
    }
}
