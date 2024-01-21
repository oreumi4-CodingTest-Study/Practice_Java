// [BOJ]최소, 최대(10818번) / 브론즈3

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] num = new int[T];

            //T만큼 num배열에 적재
            for (int i = 0; i < T; i++) {
                num[i] = sc.nextInt();
            }
            //Arrays 정렬 사용
            Arrays.sort(num);
            //첫번째 배열과 가장 마지막 배열 출력
            System.out.println(num[0] + " " + num[num.length - 1]);
    }
}