package Solution.March_3rd.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class beakjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // -10^7 이상 10^7 이하의 범위를 갖는 배열 생성
        int[] cntArray = new int[20000001]; // 배열 크기 = 10^7 이상 10^7 이하의 정수 범위 * 2 + 1

        // 각 숫자의 카운트를 배열에 저장
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            cntArray[num + 10000000]++; // 음수의 경우 인덱스가 음수가 되지 않도록 10^7을 더해줌
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 배열에서 각 숫자의 카운트를 조회하여 출력
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            sb.append(cntArray[num + 10000000]).append(" ");
        }

        System.out.println(sb);
    }
}
