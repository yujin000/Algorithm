class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=1;i<=phone_number.length()-4;i++){
            answer+="*";
        }
        return answer+phone_number.substring(phone_number.length()-4);
    }
}