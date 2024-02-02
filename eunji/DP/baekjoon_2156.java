//포도주 시식 - 실버1
import java.io.*;

public class baekjoon_2156 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		for(int i=1; i < n+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 경우의 수 세가지 (dp배열은 n번째 와인까지 따졌을 때 마실 수 있는 최대양)
		// 1. 전전전까지의 최대 양 + 전번째(n-1)번째 양 + 현재 양
		// 2. 전전(n-2)까지 최대 양 + 현재 양
		// 3. 전까지(n-1) 최대 양 (현재는 x)
		int[] dp = new int[n+1];
		dp[1] = arr[1];
		if(n>1) { // n =1 의 경우 대비
			dp[2] = arr[1]+arr[2];
		}
		 for(int i=3; i<n+1; i++) {
			 dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
		 }
		 System.out.println(dp[n]);
	}
}
