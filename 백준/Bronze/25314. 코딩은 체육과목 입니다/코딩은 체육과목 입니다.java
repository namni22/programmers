import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "long";
        for(int i=0;i<n/4-1;i++){
            answer += " long";
        }
        System.out.println(answer+" int");

    }
}