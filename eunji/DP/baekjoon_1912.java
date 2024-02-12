// 연속합 - 실버2
// n개의 정수(음수 포함)로 이루어진 임의의 수열에서 연속된 수들 중 만들 수 있는 가장 큰 합을 출력
import java.io.*;
import java.util.*;
public class baekjoon_1912 {
	
	static int n,max;
	static int[] nArr;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		nArr = new int[n+1];
		dp = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=1; i<n+1; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
			
		}
		dp[1] = nArr[1];
		max = nArr[1];
		for(int i=2; i<n+1; i++) {
			// 이전 dp + 현재 nArr 값 과 현재 nArr 값 중 큰 것을 dp에 저장
			dp[i] = Math.max(dp[i-1]+nArr[i], nArr[i]);
			//dp값들 중 가장 큰 값을 리턴하기 위해서
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
		
	}
}
