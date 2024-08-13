class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int ctn = 0;
        if(a==b){
            ++ctn;
        }
        if(b==c){
            ++ctn;
        }
        if(a==c){
            ++ctn;
        }
        switch(ctn){
            case 0: answer = a+b+c;
                break;
            case 1: answer = (a+b+c)*(a*a+b*b+c*c);
                break;
            default: answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
                break;
        }
        return answer;
    }
}