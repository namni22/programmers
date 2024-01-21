class Solution {
    public int solution(String s) {
        if(s.charAt(0)=='+'||s.charAt(0)=='-'){
            return s.charAt(0)=='-'?-Integer.parseInt(s.substring(1)):Integer.parseInt(s.substring(1));
        }
        return Integer.parseInt(s);
    }
}