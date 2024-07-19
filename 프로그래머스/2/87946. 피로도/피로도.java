import java.util.*;

class Solution {
    private static int answer;
    private static boolean[] visited;
    private static int[][] arr;
    
    private static void backtracking(int k, int cnt){
        for(int i=0; i<arr.length; i++){
            if(!visited[i] && k>=arr[i][0]){
                visited[i]=true;
                backtracking(k-arr[i][1], cnt+1);
                answer=Math.max(answer,cnt+1);
                visited[i]=false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited= new boolean[dungeons.length];
        arr = dungeons;
        
        backtracking(k,0);
        return answer;
    }
}