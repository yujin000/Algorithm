import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for(int i=0; i<n; i++){
            //인용 횟수가 논문의 순서보다 크거나 같은 경우의 개수를 구함
            int hIndex = n - i;
            
            //해당 인용 횟수가 현재 논문의 인용 횟수보다 크거나 같으면 H-Index를 반환
            if (citations[i] >= hIndex) {
                return hIndex;
            }
        }
        return 0;
    }
}