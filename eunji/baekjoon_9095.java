
import java.io.*;

public class baekjoon_9095 {
	static int T;
	
	public static void main(String[] args) throws IOException{
		// 정수 n 을 123의 합으로 나타내는 방법의 수 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		int arr[] = new int[11]; //n+2를 하면 안되는 이유? ArrayIndexOutOfBounds가 뜸
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int a=0; a<T; a++) {
			int n = Integer.parseInt(br.readLine());
			// 4를 예로 들면
			// 1+3 => 3의 경우의수 4
			// 2+2 => 2의 경우의 수 2
			// 3+1 => 1의 경우의 수 1
			// 3개의 경우로 찢어서 나머지 경우의 수 구하면 됨
			for(int i=4; i<n+1; i++) {
				arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
			}
			System.out.println(arr[n]);
		}

	}
}
