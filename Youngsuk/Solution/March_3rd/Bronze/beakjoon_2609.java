package Solution.March_3rd.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int GCD = 0;
        int LCM;
        if (y > x) {
            int temp = y;
            y = x;
            x = temp;
        }
        for (int i = 1; i <= y; i++) {
            if (x % i == 0 && y % i == 0 && GCD < i) {
                GCD = i;
            }
        }
        int i=1;
        while(true) {
            if(GCD*i%x==0 && GCD*i%y==0) {
                LCM=GCD*i;
                break;
            }
            i++;
        }
        System.out.println(GCD);
        System.out.println(LCM);
    }
}