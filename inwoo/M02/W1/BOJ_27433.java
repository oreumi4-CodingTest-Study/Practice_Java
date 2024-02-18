package M02.W1;

import java.io.*;

public class BOJ_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(Long.toString(factorial(N))+"\n");


        bw.flush();
        bw.close();
    }

    public static long factorial(int N) {
        if (N == 0) {
            return 1l;
        }
        return N * (long)factorial(N-1);
    }
}
