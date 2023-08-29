class Solution {
    public int solution(int[] num_list) {
        String answer1="";
        String answer2="";
        for(int i : num_list){
            if(i%2!=0){
                answer1 = answer1+Integer.toString(i);
            }
            else{
                answer2 = answer2+Integer.toString(i);
            }
        }
        return Integer.parseInt(answer1)+Integer.parseInt(answer2);
    }
}