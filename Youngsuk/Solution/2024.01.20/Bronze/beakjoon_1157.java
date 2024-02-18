import java.util.Scanner;

class beakjoon_1157 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int[] arr = new int[26];
        int max = -1;
        char ch = '?';

        for (int i = 0; i < word.length(); i++){
            if (65 <= word.charAt(i) && word.charAt(i) <= 90) { // 대문자 범위
                arr[word.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}