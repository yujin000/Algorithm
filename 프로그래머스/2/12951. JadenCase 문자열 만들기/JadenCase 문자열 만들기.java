import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean truefalse = true;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i); 
            if(Character.isWhitespace(c)){
                sb.append(c);
                truefalse=true;
            }else{
                if(truefalse){
                    sb.append(Character.toUpperCase(c));
                    truefalse=false;
                }else{
                    sb.append(Character.toLowerCase(c));
                }
                
            }
        }
        return sb.toString();
    }
}