package M02.W3;

/**
 * 출처 : BAEKJOON
 * 문제 : 알고리즘 수업 - 피보나치 수 1 (24416)
 * 난이도 : 브론즈 1
 */

import java.io.*;

public class BOJ_24416 {
    static int count1 = 0;
    static int count2 = 0;

    // 재귀호출
    public static int fibonacci1(int n) {
        if (n == 1 || n == 2) {
            count1++;
            return 1;
        }
        return fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    // 동적 프로그래밍
    public static void fibonacci2(int n, int[] dp) {
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            count2++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        fibonacci1(n);
        fibonacci2(n, dp);

        System.out.println(count1 + " " + count2);
    }
}
