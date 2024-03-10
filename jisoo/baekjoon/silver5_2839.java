import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class silver5_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = Integer.MAX_VALUE;

        if(n%5 == 0){
            System.out.println(n/5);
            return;
        }

        for (int i = 0; i <= n/5; i++) {
            if((n-5*i)%3==0){
                if(count > i+(n-5*i)/3){
                    count = i+(n-5*i)/3;
                }
            }
        }

        if(count == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(count);
        }

    }
}
