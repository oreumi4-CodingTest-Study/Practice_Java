import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mushroom = new int[10];
        int score = 0;
        int result = 0;

        for (int i = 0; i < mushroom.length; i++) {
            mushroom[i] = sc.nextInt();
        }

        for (int i = 0; i < mushroom.length; i++) {
            int before = score;
            score += mushroom[i];
            if(Math.abs(100-score) > Math.abs(100-before)){
                result = before;
                break;
            }
            else{
                result = score;
            }
        }
        System.out.println(result);
    }
}
