package M02.W2;

/**
 * 출처 : BAEKJOON
 * 문제 : 별 찍기 (2447)
 * 난이도 : 골드 5
 */

import java.io.*;

public class BOJ_2447 {
    public static void star(String[] lines, int N, int startX, int startY) {
        int subN = N / 3;
        String blank = lines[0].substring(0, subN).replace("*", " ");

        for (int y = 0; y < 3; y++) {
            if (y == 1) {
                for (int i = 0; i < subN; i++) {
                    String blankLine = lines[startY + subN + i].substring(0, startX + subN) + blank + lines[startY + subN + i].substring(startX + subN * 2, lines[0].length());
                    lines[startY + subN + i] = blankLine;
                }
            }
            for (int x = 0; x < 3; x++) {
                if (!(x == 1 && y == 1) && subN >= 3) {
                    star(lines, subN, startX + subN * x, startY + subN * y);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        String line = "*";
        while (line.length() < N) {
            line = line + line + line;
        }

        String[] lines = new String[N];
        for (int i = 0; i < N; i++) {
            lines[i] = line;
        }

        star(lines, N, 0, 0);
        for (int i = 0; i < N; i++) {
            System.out.println(lines[i]);
        }
    }
}
