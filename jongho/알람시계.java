import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// 현재 시간이 45분보다 적을 분일 때!
		if (M < 45) {
			if (H == 0) {
				H = 23;
			} else {
				H -= 1;
			}

			M += 15;

		}
		//현재 시간이 45분보다 같거나 클 때!
		else {
			M -= 45;
		}

		System.out.println(H + " " + M);
	}
}
