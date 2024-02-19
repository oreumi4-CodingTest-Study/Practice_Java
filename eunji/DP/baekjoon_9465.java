package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준9465 - 스티커 (실버 1)
// 스티커 2행 n열, 스티커(스티커 마다 점수가 다름) 한장당 변(상하좌우)을 공유하는 스티커가 모두 떼어짐
// -> 2n개의 스티커 중에서 점수의 합이 최대가 되면서 서로 변을 공유하지 않는 스티커 집합 구하기
// 테스트 케이스 T, n 스티커 입력, 테스트 케이스 별 가질 수 있는 최대 점수 합 출력
public class baekjoon_9465 {
    static int T;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for(int t= 0; t < T; t++){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][n];
            int[][] dp = new int[2][n];
            for(int i = 0; i <2; i++ ){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][0] = arr[0][0];
            dp[1][0] = arr[1][0];
            int max = Math.max(dp[0][0], dp[1][0]);
            if(n>1) {
                dp[0][1] = dp[1][0] + arr[0][1];
                dp[1][1] = dp[0][0] + arr[1][1];
                max = Math.max(dp[0][1], dp[1][1]);
            }
            // 점화식
            // 1. 자신의 왼쪽 대각선의 dp 값
            // 2. 자신의 왼쪽 왼쪽 옆에 위치한 dp 값
            // 둘 중 큰 값 + 자신 위치의 arr값이 dp 값임!
            for(int i=2; i<n; i++){
                dp[0][i] = Math.max(dp[1][i-1],dp[1][i-2]) + arr[0][i];
                dp[1][i] = Math.max(dp[0][i-1],dp[0][i-2]) + arr[1][i];
                max = Math.max(max, Math.max(dp[0][i],dp[1][i]));
            }
            sb.append(max +"\n");

        }
        System.out.println(sb);
    }
}
