//계단 오르기 - 실버 3
//계단은 한번에 연속 1,2계단씩만 오를 수 있다.
//마지막 도착 계단은 밟아야한다.
//각 계단에 쓰여 있는 점수가 주어질 때 얻을 수 있는 점수의 최댓값 구하기
import java.io.*;
public class baekjoon_2579 {
	public static int N;
	public static int[] arr;
	public static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N+2];
		dp = new int[N+2];
		for(int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 마지막 계단(i)을 기준의 경우의 수
		// 1. i-1, i -> i-2는 안되는디? -> 그렇기 때문에 (dp[i-3] + arr[i-1])+ arr[i]
		// 2. i-2, i -> dp[i-2] + arr[i]
		// 두경우의 수 중 큰 수를 리턴하면 됨!
		dp[1] = arr[1];
		dp[2] = arr[1]+arr[2];
		for(int i=3; i<N+1; i++) {
			dp[i] = Math.max(dp[i-3]+arr[i-1], dp[i-2])+arr[i];
		}
		System.out.println(dp[N]);
	}

}
