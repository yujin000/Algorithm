import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            int num = 100 - progresses[i];
            if(num%speeds[i]==0){
                queue.offer(num/speeds[i]);
            }else{
                queue.offer((num/speeds[i])+1);
            }
        }

        Queue<Integer> result = new LinkedList<>();
        while(!queue.isEmpty()){
            int num = queue.poll();
            int count = 0;
            count++;
            while(!queue.isEmpty() && num>=queue.peek()){
                queue.poll();
                count++;
            }
            result.offer(count);
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i<answer.length; i++) {
            answer[i] = result.poll();
        }
        return answer; 
    }
}