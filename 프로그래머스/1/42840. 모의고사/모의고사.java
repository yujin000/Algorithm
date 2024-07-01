import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] people = {{1,2,3,4,5},
                          {2,1,2,3,2,4,2,5},
                          {3,3,1,1,2,2,4,4,5,5}};
        
        int[] result= new int[3];
        
        for(int i=0;i<answers.length;i++){
            for(int j=0;j<people.length;j++){
                if(answers[i]==people[j][i%people[j].length]){
                    result[j]++;
                }
            }
        }
        
        int max = Arrays.stream(result).max().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<result.length;i++){
            if(max==result[i]){
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
            
        return answer;
    }
}