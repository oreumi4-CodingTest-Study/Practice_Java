class PGS_정수삼각형 {
    public int solution(int[][] triangle) {
        int height = triangle.length;
        long[][] dp = new long[height][height];

        dp[0][0] = triangle[0][0];

        for (int i = 1; i < height; i++) {
            dp[i][0] = dp[i-1][0] + triangle[i][0];
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
            }
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
        }

        long answer = 0;
        for (int j = 0; j < height; j++) {
            if (answer < dp[height-1][j]) answer = dp[height-1][j];
        }

        return (int) answer;
    }
}