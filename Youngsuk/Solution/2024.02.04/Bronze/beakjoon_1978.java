import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int numLength = Integer.parseInt(sc.readLine());
        int[] ints = new int[numLength];
        StringTokenizer st = new StringTokenizer(sc.readLine());
        int answer = 0;

        for (int i = 0; i < numLength; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }

        for (int num:
                ints) {
            int cnt = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}