class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for(int i=3;i<=Math.sqrt(sum);i++){
            if(sum%i==0){
                int j = sum/i;
                int result = (j-2) * (i-2);
                if(result==yellow){
                    answer[0]=j;
                    answer[1]=i;
                }
            }
        }
        return answer;
    }
}