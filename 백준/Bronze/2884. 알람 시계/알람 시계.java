import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String[] time  = t.split("\\s");
        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        m = m - 45;
        if(m<0){
            m = 60+m;
            h -= 1;
            if(h<0){
                h = 23;
            }
        }
        System.out.println(h+" "+m);
    }
}