import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j= 0; j<N-i; j++) { // j의 조건식을 굉장히 많이 고민했습니다....
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { //여기서 15분 정도 어리둥절
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
