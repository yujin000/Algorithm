class Solution {
    public int solution(int[] num_list) {
        int answer1 = 1;
        int answer2 = 0;
        for(int num : num_list){
            answer1=answer1*num;
        }

        for(int num : num_list){
            answer2=answer2+num;
        }
        answer2=answer2*answer2;
        System.out.println(answer1);
        System.out.println(answer2);
        
        answer1 = answer1<answer2 ? 1 : 0;
        
        return answer1;
    }
}