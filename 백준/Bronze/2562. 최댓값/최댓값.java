import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<9;i++){
            arr.add(sc.nextInt());
        }
        int max = arr.get(0);
        for(int num : arr){
            max = num>max?num:max;
        }
        System.out.println(max);
        System.out.println(arr.indexOf(max)+1);
    }
}