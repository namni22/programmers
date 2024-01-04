import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(int i=0; i<a.length();i++){
            char alpa = a.charAt(i);
            if(65 <= alpa && alpa <= 90 ){
                alpa += 32;
            }else{
                alpa -= 32;
            }
            result = result+alpa;
        }
        System.out.println(result);
    }
}