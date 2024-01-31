import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        for(int k=0;k<m;k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int[] newArr = new int[j+1];
            int x = j;
            for(int l=i;l<=j;l++){
                newArr[l-1] = arr[x-1];
                x--;
            }
            for(int l=i-1;l< j;l++){
                arr[l] = newArr[l];
            }
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}