import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        // 가장 유의할 점 : 문저열의 앞 뒤에 공백이 있을 수 있음.
        // 어떻게 해결할 것인가?
        // 1. charAt을 통한 공백 확인 - 난이도 상
        // 2. StringTokenizer를 통한 문자열의 개수 확인 - 난이도

        // 1. 띄어쓰기 기준으로 문자열을 분리StringTokenizer st = new StringTokenizer(문자열);
        // 2. 구분자를 기준으로 문자열을 분리StringTokenizer st = new StringTokenizer(문자열, 구분자);
        // 3. 구분자를 기준으로 문자열을 분리할 때 구분자도 토큰으로 넣는다. (true) * 구분자를 분리된 문자열 토큰에 포함 시키지 않는다. (false) * (디폴트 : false) */
        // StringTokenizer st = new StringTokenizer(문자열 , 구분자 , true/false);

        StringTokenizer st = new StringTokenizer(str," ");
        System.out.println(st.countTokens());
    }
}
