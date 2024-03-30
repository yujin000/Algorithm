class Solution {
    public int solution(String s) {
        String[] result = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<result.length;i++){
            if(s.contains(result[i])){
                s=s.replace(result[i],String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }
}