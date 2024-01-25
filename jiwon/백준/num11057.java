package silver;

import java.util.Scanner;

public class num11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][10];
        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i - 1][k] % 10007;
                }
            }
        }
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += dp[n - 1][i];
        }
        System.out.println(total%10007);
    }
}
