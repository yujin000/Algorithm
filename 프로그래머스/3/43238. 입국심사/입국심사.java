import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        //입국심사 시간 정렬
        Arrays.sort(times);
        
        long min = 0;
        long max = times[times.length-1]*(long)n;
        long answer = 0;
        
        while(min<=max){
            long mid=(max+min)/2;
            long count = 0;
            for(int i=0;i<times.length;i++){
                count+=mid/times[i];
            }
            
            if(count<n){
                min=mid+1;
            }else{
                max=mid-1;
                answer=mid;
            }
        }
        return answer;
    }
}