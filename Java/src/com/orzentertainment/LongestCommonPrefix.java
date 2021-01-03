package com.orzentertainment;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] args){

        if(args.length == 0 || args == null)
            return "";
        String longestCommonPrefix = "";
        for(int i=0; i<args[0].length(); i++){
            String stringBuilt = "";
            for(int j=i; j<args[0].length(); j++){
                String current = args[0].charAt(j) + "";
                stringBuilt = stringBuilt + current;
                boolean containsInAll = true;
                for(int k=1; k<args.length; k++){
                    String currentString = args[k];
                    if(currentString.indexOf(stringBuilt) == -1){
                        containsInAll = false;
                        break;
                    }
                }
                if(containsInAll){
                    if(stringBuilt.length() > longestCommonPrefix.length())
                        longestCommonPrefix = stringBuilt;
                }else{
                    break;
                }
            }
        }
        System.out.println(longestCommonPrefix);
        return longestCommonPrefix;

    }


    //        HashMap<Character, Integer> countMap = new HashMap<>();
    //        ArrayList<Character> characterList = new ArrayList<>();
    //
    //        if(args.length == 0 || args == null)
    //            return "";
    //        for(int i=0; i<args[0].length(); i++){
    //                char current = args[0].charAt(i);
    //                characterList.add(current);
    //                countMap.put(current, 1);
    //        }
    //        for(int i=1; i<args.length; i++){
    //            for(int x=0; x<args[i].length(); x++){
    //                char current = args[i].charAt(x);
    //                if(countMap.containsKey(current)){
    //                    countMap.replace(current, countMap.get(current), countMap.get(current)+1);
    //                }
    //            }
    //        }
    //        ArrayList<Character> matchingList = new ArrayList<>();
    //        for(int i=0; i<characterList.size(); i++){
    //            char current = characterList.get(i);
    //            if(countMap.get(current) == args.length){
    //                matchingList.add(current);
    //            }
    //        }
    //        for(int i=0; i<matchingList.size(); i++){
    //            System.out.println("Matching list at index " + i + ": " + matchingList.get(i));
    //        }
    //
    //
    //        String longestSubString = "";
    //        for(int i=0; i<matchingList.size(); i++){
    //            String builtString = "";
    //            for(int j = i; j<matchingList.size(); j++){
    //                String current = matchingList.get(j) + "";
    //                System.out.println(current);
    //                String builtStringCopy = builtString + current;
    //                if(args[0].indexOf(builtStringCopy) == -1){
    //                    if(longestSubString.length() < builtString.length()){
    //                        longestSubString = builtString;
    //                    }
    //                }else{
    //                    builtString = builtString + current;
    //                }
    //            }
    //            if(builtString.length() > longestSubString.length())
    //                longestSubString = builtString;
    //        }
    //        System.out.println(longestSubString);
    //        return longestSubString;
}
