package M02.W3;

/**
 * 출처 : BAEKJOON
 * 문제 : DNA 비밀번호 (12891)
 * 난이도 : 실버 2
 */

import java.io.*;

public class BOJ_12891 {
    // count index
    final static int A = 0;
    final static int C = 1;
    final static int G = 2;
    final static int T = 3;

    public static boolean isPassword(int[] count, int[] minCountInform) {
        boolean isPassword = false;
        if (count[A] >= minCountInform[A] &&
                count[C] >= minCountInform[C] &&
                count[G] >= minCountInform[G] &&
                count[T] >= minCountInform[T]) {
            isPassword = true;
        }
        return isPassword;
    }

    public static void countDNA(int[] count, char dna) {
        switch(dna) {
            case 'A':
                count[A]++;
                break;
            case 'C':
                count[C]++;
                break;
            case 'G':
                count[G]++;
                break;
            case 'T':
                count[T]++;
                break;
        }
    }

    public static void discountDNA(int[] count, char dna) {
        switch(dna) {
            case 'A':
                count[A]--;
                break;
            case 'C':
                count[C]--;
                break;
            case 'G':
                count[G]--;
                break;
            case 'T':
                count[T]--;
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] passwordInform = br.readLine().split(" ");
        int S = Integer.parseInt(passwordInform[0]);
        int P = Integer.parseInt(passwordInform[1]);

        String dnaStr = br.readLine();

        String[] minCountInformStr = br.readLine().split(" ");
        int[] minCountInform = new int[4];
        for (int i = 0; i < 4; i++) {
            minCountInform[i] = Integer.parseInt(minCountInformStr[i]);
        }

        int countPassword = 0;
        int[] count = {0, 0, 0, 0};
        char dna;
        int startIdx = 0;
        int endIdx = 0;

        while (endIdx < P) {
            dna = dnaStr.charAt(endIdx);
            countDNA(count, dna);
            endIdx++;
        }
        if (isPassword(count, minCountInform)) {
            countPassword++;
        }
        while (endIdx < dnaStr.length()) {
            dna = dnaStr.charAt(startIdx);
            discountDNA(count, dna);
            startIdx++;

            dna = dnaStr.charAt(endIdx);
            countDNA(count, dna);
            endIdx++;

            if (isPassword(count, minCountInform)) {
                countPassword++;
            }
        }

//        [while문 2개를 합쳐보려고 했으나 실패한 코드]
//        while (endIdx < dnaStr.length()) {
//            if (endIdx >= P) {
//                dna = dnaStr.charAt(startIdx);
//                discountDNA(count, dna);
//                startIdx++;
//            }
//
//            dna = dnaStr.charAt(endIdx);
//            countDNA(count, dna);
//            endIdx++;
//
//            if (isPassword(count, minCountInform)) {
//                countPassword++;
//            }
//        }

        System.out.println(countPassword);
    }
}
