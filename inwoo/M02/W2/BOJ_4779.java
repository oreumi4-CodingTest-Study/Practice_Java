package M02.W2;

/**
 * 출처 : BAEKJOON
 * 문제 : 칸토어 집합 (4779)
 * 난이도 : 실버 3
 */

import java.io.*;

public class BOJ_4779 {
    public static String cantor(String str, int N) {
        if (N == 0) {
            return str; // str == "-"
        }
        String subStr = str.substring(0, str.length() / 3); // 1/3 부분 문자열
        return cantor(subStr, N - 1) + subStr.replace("-", " ") + cantor(subStr, N - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;
        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {   // 입력 끝에서 반복 종료
            N = Integer.parseInt(input);
            String str = "-";
            for (int i = 0; i < N; i++) {
                // 문자열 x3
                str = str + str + str;
            }
            bw.write(cantor(str, N) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
