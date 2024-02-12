import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int max = temp.length();
        int n = Integer.parseInt(temp);
        for (int i = n-(9*max); i < n; i++){
            int sum = 0;
            for (int j = max; j > 0; j--) {
                sum+= (i%(Math.pow(10,j)))/Math.pow(10,j-1);
            }
            if (i+sum == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}