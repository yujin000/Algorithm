import java.util.*;

class Solution {
    private int sum1;
    private int sum2;
    public int[] solution(String s) {
        sum1 = 0;
        sum2 = 0;
        int[] arr = new int[2];
        
        while(!s.equals("1")){
            int result = zeroString(s);
            s = binary(result);
        }
        
        arr[0]=sum1;
        arr[1]=sum2;
        return arr;
    }
    
    private int zeroString(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c !='0'){
                count++;
            }else{
                sum2++;
            }
        }
        return count;
    }
    
    private String binary(int num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num % 2);
            num = num / 2;
        }
        sum1++;
        return sb.reverse().toString();
    }
}