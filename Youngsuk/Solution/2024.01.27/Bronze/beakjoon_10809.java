import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class beakjoon_10809{
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (arr[ch-97] == -1) {
                arr[ch - 97] = j;
            }
        }

        for(int val : arr) {
            System.out.print(val+" ");
        }
    }
}