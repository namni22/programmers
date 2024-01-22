class Solution {
    public int[] solution(long n) {
        int[] answer = new int[(int)(Math.log10(n)+1)];
        int index = 0;
        for(int i=answer.length-1;i>=0;i--){
            answer[index] = Character.getNumericValue(Long.toString(n).charAt(i));
            index++;
        }
        return answer;
    }
}