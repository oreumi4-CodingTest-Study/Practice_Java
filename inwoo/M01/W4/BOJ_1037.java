package M01.W4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BOJ_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int divisorNum = Integer.parseInt(bf.readLine());
        String s = bf.readLine();
        String[] divisors = s.split(" ");


        int minDiv = Integer.parseInt(divisors[0]);
        int maxDiv = Integer.parseInt(divisors[0]);

        for (int i = 1; i < divisors.length; i++) {
            if (minDiv > Integer.parseInt(divisors[i])) {
                minDiv = Integer.parseInt(divisors[i]);
            }
            if (maxDiv < Integer.parseInt(divisors[i])) {
                maxDiv = Integer.parseInt(divisors[i]);
            }
        }

        bw.write(Integer.toString(maxDiv * minDiv));

        bw.flush();
        bw.close();
    }
}
