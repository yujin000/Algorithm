import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        List<Integer> list = Arrays.asList(Arrays.stream(num_list).boxed().toArray(Integer[]::new));
        if(list.contains(n)){
            return 1;
        }else{
            return 0; 
        }
    }
}