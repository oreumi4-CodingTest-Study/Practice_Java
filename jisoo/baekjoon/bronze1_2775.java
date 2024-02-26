import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze1_2775 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] floor = new int[15];

            for (int j = 0; j < floor.length; j++) {
                floor[j] = j+1;
            }

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) {
                    if(j == 0){
                        floor[j] = 1;
                    }else{
                        floor[j] = floor[j] + floor[j-1];
                    }
                }
            }
            sb.append(floor[n - 1]).append("\n");
        }
        System.out.println(sb);
    }
}