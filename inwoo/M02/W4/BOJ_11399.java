package M02.W4;

/**
 * 출처 : BAEKJOON
 * 문제 : ATM (11399)
 * 난이도 : 실버 3
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] waitTime = new int[N];
        for (int i = 0; i < N; i++) {
            waitTime[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(waitTime);
        int sumWaitTime = 0;
        for (int i = 0; i < N; i++) {
            sumWaitTime += waitTime[i] * (N - i);
        }
        System.out.println(sumWaitTime);
    }
}
