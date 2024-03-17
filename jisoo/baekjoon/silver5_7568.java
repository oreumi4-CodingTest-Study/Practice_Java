import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 7568번 덩치
public class silver5_7568 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int[] heights = new int[people];
        int[] weights = new int[people];
        for (int i = 0; i < people; i++) {
            heights[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }

        int[] lank = new int[people];
        for (int i = 0; i < people; i++) {
            for (int j = 0; j < people; j++) {
                if( heights[i] < heights[j] && weights[i] < weights[j]){
                    lank[i]++;
                }
            }
        }

        for (int result : lank){
            System.out.print(result+1 + " ");
        }
    }
}
