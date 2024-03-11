import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze2_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int num =  Integer.parseInt(st.nextToken());
            if(num == 1){
                numCount--;
                continue;
            }
            for (int i = 2; i <= num; i++) {
                if(num % i == 0 && num != i){
                    numCount--;
                    break;
                }
            }
        }

        System.out.println(numCount);
    }
}
