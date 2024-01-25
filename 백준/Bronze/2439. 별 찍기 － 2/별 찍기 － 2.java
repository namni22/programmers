import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            String star = "";
            for(int j=n-i;j>1;j--){
                star += " ";
            }
            for(int k=0;k<i+1;k++){
                star += "*";
            }
            System.out.println(star);
        }
    }
}