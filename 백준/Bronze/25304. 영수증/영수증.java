import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine()); // 영수증 총 금액
        int n = Integer.parseInt(sc.nextLine()); // 구매한 물건의 종류 수
        int sum = 0;
        for(int i=0;i<n;i++){
            String ab = sc.nextLine();
            String[] arr = ab.split("\\s");
            sum += Integer.parseInt(arr[0])*Integer.parseInt(arr[1]);
        }
        System.out.println(x==sum?"Yes":"No");

    }
}