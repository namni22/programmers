import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        String[] dice  = r.split("\\s");
        int[] diceNum = new int[dice.length];
        for (int i = 0; i < dice.length; i++) {
            diceNum[i] = Integer.parseInt(dice[i]);
        }
        int reward = diceNum[0];
        if(diceNum[0]!=diceNum[1]&&diceNum[0]!=diceNum[2]&&diceNum[1]!=diceNum[2]){
            for(int i = 0;i<3;i++){
                reward = Math.max(reward, diceNum[i]);
            }
            System.out.println(reward*100);
        }else{
            if(diceNum[0]==diceNum[1]&&diceNum[0]==diceNum[2]){
                System.out.println(10000+reward*1000);
            }else{
                reward = diceNum[0]==diceNum[1]?diceNum[0]:diceNum[0]==diceNum[2]?diceNum[0]:diceNum[1];
                System.out.println(1000+reward*100);
            }
        }
    }
}