import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        HashSet<Integer> hashSet = new HashSet<>();
        
        for(int i : nums){
            hashSet.add(i);
        }
        
        return answer < hashSet.size() ? answer : hashSet.size();
    }
}