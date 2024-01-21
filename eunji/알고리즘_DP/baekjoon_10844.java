//쉬운 계단수 - 실버1
import java.io.*;

public class baekjoon_10844 {
	static final long MOD = 1_000_000_000L;
	public static void main(String[] args) throws IOException{
		//N에 대해 길이가 N인 계단 수가 총 몇 개 있는지 구하기(0으로 시작 x)
		// 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		//dp[i][j] 길이가 i고 j로 시작하는 계단수의 개수
		// 점화식
		// 길이가 i일 때, 0으로 시작하는 수는 dp[i][0] = dp[i-1][1]
		// 길이가 i이고 j로 시작하는 수 일때, dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1]
		// 단, 길이가 i이고 9로 시작하는 수는 dp[i-1][8]과 동일 
		long[][] dp = new long[N+1][10]; // 숫자가 커지니 long으로!
		for(int i=0; i<=9; i++) {
			dp[1][i] = 1L;
		}
		for(int i=2; i<=N; i++) {
			//0으로 시작하는 수
			dp[i][0] = dp[i-1][1];
			for(int j=1;j<=9; j++) {
				// 9일 경우는 이전 자릿수의 8로 시작하는 수의 개수와 동일
				if(j==9) dp[i][9] = dp[i-1][8]%MOD;
				//머지 수들은 이전 숫자의 j-1로 시작하는 수의 개수와 j+1로 시작하는 수의 개수를 더한 값이다.
				else dp[i][j] = (dp[i-1][j-1]%MOD + dp[i-1][j+1]%MOD)%MOD;
			} 
		}
		long result = 0;
		for(int i=1; i<=9; i++) {
			//길이가 N인 계단수들의 합
			result = (result+dp[N][i])%MOD;
		}
		System.out.print(result);
	}

}
