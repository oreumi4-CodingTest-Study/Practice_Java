import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 666; 0 < n; i++) {
            if(String.valueOf(i).contains("666")){
                result = i;
                n--;
            }
        }

        System.out.println(result);
    }
}
