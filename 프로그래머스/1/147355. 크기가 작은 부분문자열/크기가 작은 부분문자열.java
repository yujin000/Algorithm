import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int num = t.length()-p.length()+1;
        int answer = 0;
        
        for(int i=0;i<num;i++){
            String result = t.substring(i,i+p.length());
            if (Long.parseLong(result) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}