import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
         for(int i : arr){
            if(i%divisor==0){
                list.add(i);
            }
        }
        int[] answer;
        
        if(list.isEmpty()){
            answer = new int[]{-1};
        } else {
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}