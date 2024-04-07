import java.util.*;

class Solution {
    private int[] arr;
    private Set<Integer> set;
    
    public int[] solution(int[] numbers) {
        arr = new int[2];
        set = new TreeSet<>();
        dfs(0, numbers,0);
        int[] answer = new int[set.size()];
        int i=0;
        for(int s : set){
            answer[i] = s;
            i++;
        }
        return answer;
    }
    
    public void dfs(int depth, int[] numbers, int cur){
        if(depth==2){
            int sum = 0;
            for(int val: arr){
                sum+=val;
            }
            set.add(sum);
            return;
        }
        
        for(int i=cur;i<numbers.length;i++){
                arr[depth]= numbers[i];
                dfs(depth+1, numbers, i+1);
        }
    }
}