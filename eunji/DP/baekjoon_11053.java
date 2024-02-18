import java.io.*;
import java.util.*;

public class baekjoon_11053 {
	static int N;
	static int[] A;
	static int[] dp;
	
	public static void main(String[] args) throws IOException{
		// 첫째줄 수열 크기 N, 둘째줄 수열 A -> 가장 긴 증가하는 부분 수열 길이 출력
		// LIS 풀이 방식 : i번째 원소보다 작은 원소 중 가장 큰 원소의 dp값+1을 dp[i]에 저장
		// 가장 큰 dp 값이 길이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[]  A = new int[N+1];
		int[] dp = new int[N+1];
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			// 모든 dp 값들은 최소 1
			dp[i] = 1;
		}
		int max = 1;
		//i번째 원소보다 작은 원소 중 가장 큰 원소(j)의 dp값+1을 dp[i]에 저장
		for(int i = 0; i < N; i++) {
			for(int j =0; j < i; j++) {
				if(A[i] > A[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
					// 이전 원소들 중 가장 큰 dp값 + 1
				}
			}
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
