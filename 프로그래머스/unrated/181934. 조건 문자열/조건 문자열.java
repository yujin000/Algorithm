class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<")){
            if(eq.equals("=")){
                return answer = n<=m ? 1 : 0;
            }
            else{
                return answer = n<m ? 1 : 0;
            }
        }
        else{
            if(eq.equals("=")){
                return answer = n>=m ? 1 : 0;
            }
            else{
                return answer = n>m ? 1 : 0;
            }
        }
    }
}