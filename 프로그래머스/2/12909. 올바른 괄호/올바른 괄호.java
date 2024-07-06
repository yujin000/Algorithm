import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(!stack.empty() && stack.peek()== c){
                stack.pop();
            }else{
                return false;
            }
        }

        return stack.empty();
    }
}