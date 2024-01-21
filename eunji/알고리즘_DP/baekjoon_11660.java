// 구간 합 구하기 5
import java.io.*;
import java.util.*;
public class baekjoon_11660 {
	static int x1,y1,x2,y2,answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] dp = new int[N+1][N+1];
		int[][] arr = new int[N+1][N+1];
		for(int i=1; i<N+1; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
			for(int j=1; j<N+1; j++) {
				arr[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
		// 미리 dp 배열에 (i,j)까지의 합들을 구해놓기
		for(int i =1; i<=N; i++) {
			for(int j =1; j<=N; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + arr[i][j];
			}
		}
		for(int i=0; i<M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
			x1=Integer.parseInt(st2.nextToken());
			y1=Integer.parseInt(st2.nextToken());
			x2=Integer.parseInt(st2.nextToken());
			y2=Integer.parseInt(st2.nextToken());
			answer = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1];
			System.out.println(answer);
		}
		
	}
}
