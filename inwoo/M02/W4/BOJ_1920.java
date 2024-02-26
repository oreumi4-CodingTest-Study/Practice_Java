package M02.W4;

/**
 * 출처 : BAEKJOON
 * 문제 : 수 찾기 (1920)
 * 난이도 : 실버 4
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        boolean isInArr = false;
        for (int i = 0; i < M; i++) {
            int leftIdx = 0;
            int rightIdx = N-1;
            int num = Integer.parseInt(st.nextToken());
            while (leftIdx <= rightIdx) {
                int middleIdx = (leftIdx + rightIdx) / 2;
                if (num < A[middleIdx]) {
                    rightIdx = middleIdx - 1;
                } else if (num > A[middleIdx]) {
                    leftIdx = middleIdx + 1;
                } else {
                    isInArr = true;
                    break;
                }
            }
            System.out.println(isInArr? 1 : 0);
            isInArr = false;
        }
    }
}
