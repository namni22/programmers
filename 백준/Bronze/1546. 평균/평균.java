import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i=0;i<n;i++){
            scores[i] = sc.nextInt();
        }
        double m = Arrays.stream(scores).max().getAsInt();
        double avr = 0;
        for(double score : scores){
            score = (score/m)*100;
            avr += score;
        }
        System.out.println(avr/n);
    }
}