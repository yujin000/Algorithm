import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    sum=nums[i]+nums[j]+nums[k];
                    if(isTrue(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    public boolean isTrue(int sum){
        if(sum<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(sum);i++){
            if(sum%i==0){
                return false;
            }
        }
        return true;
    }
}