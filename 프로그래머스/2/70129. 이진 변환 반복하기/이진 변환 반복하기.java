import java.util.*;

class Solution {
    private int sum1;
    private int sum2;
    public int[] solution(String s) {
        sum1 = 0;
        sum2 = 0;
        int[] arr = new int[2];
        
        while(!s.toString().equals("1")){
            int result = zeroString(s);
            s = "";
            s = binary(result);
        }
        
        arr[0]=sum1;
        arr[1]=sum2;
        return arr;
    }
    
    private int zeroString(String s){
        String result="";
        for(char c : s.toCharArray()){
            if(c!='0'){
                result+=c;
            }else{
                sum2++;
            }
        }
        int intResult = result.length();
        return intResult;
    }
    
    private String binary(int num){
        StringBuilder sb = new StringBuilder();
        int index =0;
        while(true){
            sb.append(num % 2);
            num = num / 2;
            index++;
            
            if(num==0){
                break;
            }
        }
        sum1++;
        return sb.reverse().toString();
    }
}