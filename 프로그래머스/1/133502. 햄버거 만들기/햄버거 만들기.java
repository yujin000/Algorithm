import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : ingredient){
            stack.push(i);
            if(stack.size()>=4){
                int num = stack.size()-1;
                if(stack.get(num)==1&&stack.get(num-1)==3&&stack.get(num-2)==2&&stack.get(num-3)==1){
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return answer;   
    }
}