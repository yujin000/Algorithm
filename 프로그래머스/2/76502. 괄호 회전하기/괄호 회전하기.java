import java.util.*;

class Solution {
    private Queue<Character> queue = new LinkedList<>();
    
    public int solution(String s) {
        int answer = 0;
        
        for(char c : s.toCharArray()){
            queue.offer(c);
        }
        
        for(int i=0; i<s.length();i++){
            if(i==0){
                answer = correctStack(queue);
            }else{
                rotationQueue(queue);
                answer += correctStack(queue);
            }
        }
        return answer;
    }
    
    private void rotationQueue(Queue<Character> queue){
            char c = queue.poll();
            queue.offer(c);
    }
    
    private int correctStack(Queue<Character> queue){
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(char c : queue){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(!stack.isEmpty()&&stack.peek()==c){
                stack.pop();
            }else{
                return 0;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}