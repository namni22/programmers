import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        for(int i=0;i<28;i++) {
            int num = sc.nextInt();
            arr[num-1] = num;
        }
        ArrayList<Integer> student = new ArrayList<Integer>();
        for(int j=0;j<30;j++){
            if(arr[j]==0){
                student.add(j);
            }
        }
        for(int i=0;i<2;i++){
            System.out.println(student.get(i)+1);
        }
    }
}