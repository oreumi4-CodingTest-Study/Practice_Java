package DP;
// 가장 큰 증가하는 부분수열 백준 11055- 실버 2
// 수열 A가 주어졌을 때 그 수열의 증가하는 부분 수열 중 합이 가장 큰 것 구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11055 {
    static int N;
    static int[] A,dp,nowArr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        dp = new int[N];
        nowArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
            dp[i] = A[i];
        }
        // dp 는 최댓값이 아닌 해당 인덱스에서의 증부수 합
        int result = dp[0];
        for(int i = 1; i <N; i++){
            for(int j = i; j >= 0; j--){
                if(A[i]>A[j]){
                    // j 뒤에서부터 가니까 갱신된 dp[i]값이 더 클 수 있음
                    dp[i] = Math.max(dp[j]+A[i], dp[i]);
                    // 현재 인덱스에서의 증부수 합과 증부수합 최댓값 비교해서 갱신
                    result = Math.max(result, dp[i]);
                }
            }
        }
        System.out.println(result);
    }
}
