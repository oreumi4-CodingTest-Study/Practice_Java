import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class beakjoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> scoreList = new ArrayList<>();
        int num;
        int maxVal=0;
        for (int i = 0; i < n; i++){
            num = Integer.parseInt(st.nextToken());
            if (num > maxVal){
                maxVal = num;
            }
            scoreList.add(num);
        }

        double sum = 0;
        for (double score : scoreList) {
            score = score/maxVal*100;
            sum += score;
        }
        System.out.println(sum/n);
    }
}