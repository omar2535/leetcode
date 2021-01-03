package com.orzentertainment;

public class Atoi {

    public int myAtoi(String input){
        //input = input.replaceAll("\\s+", "");
        boolean isNegative = false;
        int indexOfFirstNonWhitespace = -1;
        String stringBuilder = "";
        for(int i=0; i<input.length(); i++){
            char current = input.charAt(i);
            if(current == ' '){

            }else{
                indexOfFirstNonWhitespace = i;
                break;
            }
        }
        if(indexOfFirstNonWhitespace == -1){
            return 0;
        }
        String firstChar = input.charAt(indexOfFirstNonWhitespace) + "";
        if(firstChar.equals("-")){
            stringBuilder +="-";
            indexOfFirstNonWhitespace += 1;
            isNegative = true;
        }else if(firstChar.equals("+")){
            stringBuilder += "+";
            indexOfFirstNonWhitespace +=1;
        }
        else if(!firstChar.matches("[0-9]+"))
            return 0;

        for(int i=indexOfFirstNonWhitespace; i<input.length(); i++){
            String current = input.charAt(i)+"";
            if(current.matches("[0-9]+")){
                stringBuilder = stringBuilder.concat(current);
            }else{
                break;
            }
        }
        if(stringBuilder.equals("-") || stringBuilder.equals("+"))
            return 0;

        int result;
        try{
            result = Integer.parseInt(stringBuilder);
        }catch(Exception e){
            if(isNegative){
                result = -2147483648;
            }else{
                result = Integer.MAX_VALUE;
            }
        }

        return result;
    }
}
