package DP;// 동전1
// n가지 동전으로 k원을 만들 수 있는 경우의 수 출력
// 중복 허용!

import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_2293 {

    static int n, k;
    static int[] coin, dp;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        coin = new int[n];
        // dp : 동전들로 만들 수 있는 경우의 수
        dp = new int[k + 1];

        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        // 점화식 :  k>=coin[i] 일 때 dp[k] = dp[k] + dp[k-coin[i]]
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j >= coin[i])
                    dp[j] += dp[j - coin[i]];
            }
        }
        System.out.println(dp[k]);
    }
}
