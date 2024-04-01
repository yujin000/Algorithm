import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        ArrayList<Character> list = new ArrayList<>();
        
        for(char c : arr) {
            list.add(c);
        }
        
        for(char c : skip.toCharArray()) {
            list.remove(Character.valueOf(c));
        }
        
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);    
            answer += String.valueOf(list.get((list.indexOf(c)+index)%(26-skip.length())));
        }
        return answer;
    }
}