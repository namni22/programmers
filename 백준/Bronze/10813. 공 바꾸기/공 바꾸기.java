import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int x=0;x<n;x++) {
            arr[x] = x + 1;
        }
        for(int y=0;y<m;y++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int z = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = z;
        }
        for(int z=0;z<n;z++){
            System.out.print(arr[z]+" ");
        }
    }
}