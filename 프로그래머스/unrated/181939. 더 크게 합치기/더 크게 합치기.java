class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(String.valueOf(a)+b);
        int num2 = Integer.parseInt(String.valueOf(b)+a);
        return num1>=num2?num1:num2;
    }
}