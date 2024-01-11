class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = 0;
        for(int i=0;i<included.length;i++){
            num += i==0?a:d;
            answer += included[i]?num:0;
        }
        return answer;
    }
}