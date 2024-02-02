import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alp = sc.nextLine();
        int x = 0;
        for(int i=0;i<alp.length();i++){
            if(alp.charAt(i)==alp.charAt(alp.length()-i-1)){
                x++;
            }
        }
        System.out.println(x==alp.length()?1:0);
    }
}