class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<included.length;i++){
            if(i==0){
                answer=a;
            }
            else{
                answer=answer+d;
            }  
            if(included[i]){
                sum=sum+answer;
            }
        }
        return sum;
    }
}