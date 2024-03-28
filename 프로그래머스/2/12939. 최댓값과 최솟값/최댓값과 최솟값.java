import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for(String num : arr){
            int result = Integer.parseInt(num);
            max = Math.max(max,result);
            min = Math.min(min,result);
        }
        return min+" "+max;
    }
}