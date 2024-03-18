import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

// 1676 팩토리얼 0의 개수
public class silver5_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal N = BigDecimal.valueOf(Long.parseLong(br.readLine()));
        String parseString = String.valueOf(factorial.result(N));

        int count = 0;
        for (int i = parseString.length()-1; i >= 0 ; i--) {
            if(parseString.charAt(i) != '0')
                break;
            count++;
        }

        System.out.println(count);
    }
}

class factorial {
    public static BigDecimal result(BigDecimal n){
        if(n.subtract(BigDecimal.ONE).compareTo(BigDecimal.ONE) <= 0)
            return BigDecimal.ONE;
        return n.multiply(result(n.subtract(BigDecimal.ONE)));
    }
}
