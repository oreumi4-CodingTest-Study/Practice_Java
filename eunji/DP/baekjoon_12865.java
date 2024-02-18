import java.io.*;
import java.util.*;
// 평범한 배낭 12865
// 첫째 줄 물품의 수 N, 버틸 수 있는 무게 K
// 두번째 줄 부터 N개줄은 각 물건의 무게 W 와, 해당 물건의 가치 V가 주어짐
// 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력 
public class baekjoon_12865 {
	// 점화식 세우기
	// 1. 물건의 무게 > 배낭의 무게 : dp[W][K] = dp[W-1][K]
	// 2. 물건의 무게 <= 배낭의 무게 : dp[W][K] = max(dp[W-1][K], 물건 가치 + dp[W-1][K-W])
	static int[][] item;
	static Integer[][] DP;
	static int N;
	static int K;
	static int W = 0;
	static int V = 1;
	
	static int knapsack(int i, int k) {
		// i가 0 미만(범위 밖)
		if(i < 0) return 0;
		// 탐색하지 않은 위치일 경우
		// 참고 java int형 배열은 null값 0으로 저장되므로 Integer형 써야됨
		if(DP[i][k] == null) {
			
			//현재 물건을 추가로 못담는 경우(이전 i값 탐색)
			if(item[i][W] > k) {
				DP[i][k] = knapsack(i-1,k);
			}
			// 현재 물건을 담을 수 있는 경우
			else if(item[i][W] <= k) {
				// 이전 i값과 (이전 i 값에 대한 k-item[i][w]의 값 + 현재 가치(item[i][V]))중 큰 값을 저장
				DP[i][k] = Math.max(knapsack(i-1,k), knapsack(i-1,k-item[i][W])+item[i][V]);
			}
		}
		return DP[i][k];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		DP = new Integer[N][K+1];
		item = new int[N][2];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			item[i][W] = Integer.parseInt(st.nextToken());
			item[i][V] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(knapsack(N-1,K));
		
	}
}
