import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] arr = new int[N+2];
        
        for (int stage : stages) {
            arr[stage] += 1;
        }
        
        HashMap<Integer, Double> hashMap = new HashMap<>();
        double result = stages.length;
        
        for(int i=1;i<=N;i++){
            if(arr[i]==0){
                hashMap.put(i,0.);
            }else{
                hashMap.put(i,arr[i]/result);
                result-=arr[i];
            }
        }
    
        return hashMap.entrySet().stream().sorted((o1, o2)->Double.compare(o2.getValue(), o1.getValue())).mapToInt(Map.Entry::getKey).toArray();
    }
}