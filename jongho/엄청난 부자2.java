import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		BigInteger n = scanner.nextBigInteger(); // BigInteger라는 개념을 처음 알았습니다!
		BigInteger m = scanner.nextBigInteger();

		System.out.println(n.divide(m)); // 기존에 알고있던 사칙연산자를 사용할 수 없다는걸 알았습니다...! 
		System.out.println(n.remainder(m));
	}
}
