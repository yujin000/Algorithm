import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String s : participant){
        hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }
        
        for(String s : completion){
        hashMap.put(s, hashMap.get(s) - 1);
        }
        
        for(String s : hashMap.keySet()){
        if(hashMap.get(s)!=0){
        answer=s;
        }
        }
        return answer;
    }
}