import java.util.*;
import java.io.*;
// 백준 9251 : LCS
// 골드 5
// 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제
public class baekjoon_9251 {
	static char[] a;
	static char[] b;
	static int[][] dp;
	// 문자열이 1000자 넘어가기 때문에 bottom-up 방식(반복문)이 유리 (top-down은 재귀)
	
	public static void main(String[] args)throws IOException{
		// 첫째줄 둘째줄에 문자열 입력
		// 최장 공통 부분 수열 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 받자마자 바로 charArray로 바꿔주는게 간단!
		a = br.readLine().toCharArray();
		b = br.readLine().toCharArray();
		
		int length_a = a.length;
		int length_b = b.length;
		
		// 공집합 표현을 위해 +1
		dp = new int[length_a+1][length_b+1];
		
		//  1부터 시작(index 0은 공집합이므로 0의 값을 갖고있음)
		for(int i = 1; i <= length_a; i++) {
			for(int j = 1; j <= length_b; j++) {
				
				// (i-1) 과 (j-1) 번째 문자가 서로 같다면
				if(a[i-1] == b[j-1]) {
					//대각선 위 (i-1, j-1)의 dp에 +1 한 값으로 갱신
					dp[i][j] = dp[i-1][j-1]+1;
				}
				
				// 같지 않다면 이전 열(i-1)과 이전 행(j-1)의 값 중 큰 것으로 갱신
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[length_a][length_b]);
	}

}
