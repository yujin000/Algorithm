import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {   
        Stack<Integer> stack = new Stack<>();
        
        int[] up = new int[n+2];
        int[] down = new int[n+2];
        
        k++;
        
        for(int i=0;i<n+2;i++){
            up[i]=i-1;
            down[i]=i+1;
        }
        
        for (String s : cmd) {
            char c = s.charAt(0);
           if (c == 'C') {
                stack.push(k);
                up[down[k]]=up[k];
                down[up[k]]=down[k];
                k= n<down[k] ? up[k] : down[k];
            } else if (c == 'Z') {
                int num = stack.pop();
                up[down[num]]=num;
                down[up[num]]=num;
            }else{
               int j = Integer.parseInt(s.substring(2));
                for (int i = 0; i < j; i++) {
                    k = c=='U' ? up[k] : down[k];
                }
           }
        }
        
        char[] result = new char[n];
        Arrays.fill(result,'O');
        
        for(int i : stack){
            result[i-1] = 'X';
        }
        
        return new String(result);
    }
}