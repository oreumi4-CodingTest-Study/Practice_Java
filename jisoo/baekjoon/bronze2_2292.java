import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze2_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = 0;


        for (int i = 1; ; i++) {
            if(num >= 1+3*(i-1)*(i-2) && num <= 1+3*i*(i-1)){
                result = i;
                break;
            }
        }


        System.out.println(result);
    }
}
