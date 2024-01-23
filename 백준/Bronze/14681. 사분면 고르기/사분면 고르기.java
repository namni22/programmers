import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int answer = 0;
        if(x>0){
            answer = y>0?1:4;
        }else{
            answer = y>0?2:3;
        }
        System.out.println(answer);
    }
}