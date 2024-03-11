import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze2_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toLowerCase().toCharArray();

        final int r = 31;
        final int M = 1234567891;
        final int charToNum = 96;
        long sum = 0;
        long pow = 1;
        long result = 0;

        for (int i = 0; i < input.length; i++) {
            sum += ((input[i]-charToNum) * pow) % M;
            pow = (pow * r) % M;
        }

        result = sum%M;

        System.out.println(result);

    }
}
