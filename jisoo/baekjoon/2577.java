import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        String mul = String.valueOf(a*b*c);
        int[] num = new int[10];

        for (int i = 0; i < mul.length(); i++) {
            num[mul.charAt(i)-'0']++;
        }

        for(int item : num){
            System.out.println(item);
        }
    }
}
