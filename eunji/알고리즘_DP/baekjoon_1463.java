package make_one;
import java.io.*;
import java.util.*;

public class baekjoon_1463 {

	public static void main(String[] args) throws IOException{
		//첫째줄 N 입력(N <10^6)
		// 3가지 연산을 사용하여 1로 만들때 연산을 사용하는 횟수의 최솟값을 출력하시오
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// dp[] : 정수가 i를 1로 만들 때 연산을 하는 횟수의 최솟값
		int dp[] = new int[N+1];
		dp[0] = dp[1] = 0;
		// 1. 3으로 나누거나
		// 2. 2로 나누거나
		// 3. 1을 빼거나
		// 이중 최소값을 구함
		for(int i= 2; i <= N; i++) {
			dp[i] = dp[i-1]+1; // 먼저 1을 빼준다.
			if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1); // 우선 1뺀값과 2로 나눈 값 중 최솟값을 dp[i]에 저장한다  
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1); // 다시 3으로 나눈값과 dp[i]중 최소값 구한다.
		}
		System.out.println(dp[N]);
	
	}
}
