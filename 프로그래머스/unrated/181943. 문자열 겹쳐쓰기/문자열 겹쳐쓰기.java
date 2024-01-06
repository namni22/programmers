class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer1 = my_string.substring(0,s);
        String answer2 = my_string.substring(s+(overwrite_string.length()));
        String result = answer1+overwrite_string+answer2;
        return result;
    }

}