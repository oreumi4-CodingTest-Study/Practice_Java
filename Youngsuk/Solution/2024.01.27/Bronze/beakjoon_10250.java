import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class beakjoon_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int customerNum = Integer.parseInt(sc.readLine());

        for (int i = 0; i < customerNum; i++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(sc.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if (n % h == 0) {
                sb.append(h);
            } else {
                sb.append(n % h);
            }
            double room = Math.ceil((double)n/(double)h);
            if (room < 10) {
                sb.append(0);
            }
            sb.append((int)room);
            System.out.println(sb);
        }
    }
}