import java.io.*;
//오르막 수 실버1
//오르막 수 : 수의 각 자리가 오름차순을 이루는(동일값 포함) 수
//N의 길이인 오르막 수의 개수를 10007로 나눈 나머지 구하는 프로그램
public class baekjoon_11057 {
	static int N;
	static int[][] dp;
	static final int MOD=10007;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new int[10][10];
		// 초기값 설정!
		for(int j=0; j<=9; j++) {
			dp[0][j] = 1;
		}
		// dp[i][j] = p=i~9까지인 dp[p][j-1]들의 합과 같음!
		for(int i=1; i<=N;i++) {
			for(int j=0; j<=9;j++) {
				for(int p=j; p<=9; p++) {
					dp[i][j]+=dp[i-1][p];
					dp[i][j]%=MOD;
				}
			}
		}
		
		System.out.println(dp[N][0]%MOD);
			
	}
}
