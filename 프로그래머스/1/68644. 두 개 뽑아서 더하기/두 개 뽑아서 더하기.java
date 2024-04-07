import java.util.*;

class Solution {
    private int[] arr;
    private ArrayList<Integer> list;
    
    public int[] solution(int[] numbers) {
        arr = new int[2];
        list = new ArrayList<>();
        dfs(0, numbers,0);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    
    public void dfs(int depth, int[] numbers, int cur){
        if(depth==2){
            int sum = 0;
            for(int val: arr){
                sum+=val;
            }
            if(!list.contains(sum)){
                list.add(sum);
            }
            return;
        }
        
        for(int i=cur;i<numbers.length;i++){
                arr[depth]= numbers[i];
                dfs(depth+1, numbers, i+1);
        }
    }
}
