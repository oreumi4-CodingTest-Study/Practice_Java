package Solution.Feb_4th.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2292 {
    public static void main(String[] args) throws IOException {
        //벌집 / bronze2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        int sumVal = 1;
        int count = 1;

        if (value == 1) {
            System.out.println(1);
        } else {
            while (true) {
                sumVal += (count * 6);
                if (sumVal >= value) {
                    System.out.println(count+1);
                    break;
                }
                count++;
            }
        }
    }
}