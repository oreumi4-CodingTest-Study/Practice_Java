package M02.W3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BOJ_10870 {

    public static int fibonacci(int n) {
        if (n==0) {return 0;}
        if (n==1) {return 1;}
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(fibonacci(n)));

        bw.flush();
        bw.close();
    }
}
