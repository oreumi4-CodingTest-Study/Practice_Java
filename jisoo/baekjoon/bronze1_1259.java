import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class bronze1_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] num;
        List<char[]> palindromes = new ArrayList<>();

        while(true) {
            num = br.readLine().toCharArray();
            if (num[0] == '0'){
                break;
            }
            palindromes.add(num);
        }

        for (char[] palindrome : palindromes){
            boolean result = true;
            for (int i = 0; i < palindrome.length; i++) {
                if(palindrome[i] != palindrome[palindrome.length-1-i]){
                    result = false;
                    break;
                }
            }
            System.out.println(result?"yes":"no");
        }
    }
}
