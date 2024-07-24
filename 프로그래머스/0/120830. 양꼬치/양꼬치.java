class Solution {
    public int solution(int n, int k) {
        int num = n/10;
        k-=num;
        int answer = n*12000 + k*2000;
        return answer;
    }
}