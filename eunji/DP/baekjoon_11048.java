package DP;
// 이동하기 - 백준 11048 (실버 2)
// N*M 미로에서 준규가 (1,1)에서 (N,M) 이동할때 가져올 수 있는 사탕 개수의 최댓값 구하기
// 준규가 (r, c)에 있으면, (r+1, c), (r, c+1), (r+1, c+1)로 이동할 수 있다.
// 각 방에는 사탕의 개수가 개별적으로 있고 방에 도달 시 사탕 획득
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11048 {
    static int N, M;
    static int[][] map,dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        dp = new int[N][M];
        for(int i = 0; i < N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                map[i][j]= Integer.parseInt(st1.nextToken());
            }
        }
        dp[0][0] = map[0][0];
        for(int i = 1; i < N; i++){
            dp[i][0] = dp[i-1][0]+map[i][0];
        }
        for(int j = 1; j < M; j++){
            dp[0][j] = dp[0][j-1]+map[0][j];
        }
        for(int i = 1; i < N; i++){
            for(int j = 1; j < M; j++){
                dp[i][j] = Math.max(dp[i-1][j-1],Math.max(dp[i-1][j],dp[i][j-1]))+map[i][j];
            }
        }
        System.out.println(dp[N-1][M-1]);
    }
}
