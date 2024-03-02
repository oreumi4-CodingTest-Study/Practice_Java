//백준 1149번 'RGB거리' / 실버1 / 150분

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] dp;
    static int[][] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        dp = new int[N][3];
        cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            //Red
            cost[i][Red] = Integer.parseInt(st.nextToken());
            //Green
            cost[i][1] = Integer.parseInt(st.nextToken());
            //Blue
            cost[i][2] = Integer.parseInt(st.nextToken());
        }


        //DP 초기값 설정
        dp[0][Red] = cost[0][Red];
        dp[0][Green] = cost[0][Green];
        dp[0][Blue] = cost[0][Blue];

        System.out.println(Math.min(minCost(N- 1, Red), Math.min(minCost(N - 1, Green), minCost(N - 1, Blue))));

    }

    static int minCost(int N, int color) {
        // 만약 탐색하지 않은 배열일 때
        if(dp[N][color] == 0) {

            // coloe에 따라서 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 dp에 저장
            if(color == Red) {
                dp[N][Red] = Math.min(minCost(N - 1, Green), minCost(N - 1, Blue)) + cost[N][Red];
            }
            else if(color == Green) {
                dp[N][Green] = Math.min(minCost(N - 1, Red), minCost(N - 1, Blue)) + cost[N][Green];
            }
            else {
                dp[N][Blue] = Math.min(minCost(N - 1, Red), minCost(N - 1, Green)) + cost[N][Blue];
            }

        }

        return dp[N][color];
    }

}
