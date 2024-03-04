//백준/Bronze/2577. 숫자의 개수/숫자의 개수.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력과 동시에 곱하기!
        int N = (scanner.nextInt() * scanner.nextInt() * scanner.nextInt());

        // 변수 N을 String으로 변환 후 String 타입으로 담는다!
        String str = Integer.toString(N);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) - '0' == i) {
                    count++;

                }
            }
            System.out.println(count);

        }


    }
}
