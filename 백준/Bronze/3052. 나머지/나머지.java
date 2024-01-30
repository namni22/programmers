import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] % 42;
        }
        int[] newArr = new int[10];
        int sum = 0;
        for(int j=0;j<10;j++){
            sum++;
            for(int k=j+1;k<10;k++){
                if(arr[j]==arr[k]){
                    sum--;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}