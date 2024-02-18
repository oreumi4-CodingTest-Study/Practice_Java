import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.MIN_VALUE;

public class bronze1_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subjects = Integer.parseInt(br.readLine());
        int[] scores = new int[subjects];
        int highest = MIN_VALUE;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if(scores[i] > highest){
                highest = scores[i];
            }
        }
        br.close();

        for(int score : scores){
            sum += ((double)score /highest)*100;
        }

        System.out.println(sum/scores.length);
    }
}
