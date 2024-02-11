import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class beakjoon_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = "";
        List<String> numList = new ArrayList<>();

        while (true) {
            inputNum = br.readLine();
            if (inputNum.equals("0"))
                    break;
            numList.add(inputNum);
        }

        for (String num:numList
             ) {
            String answer = "yes";
            for (int i = 0; i < (num.length() / 2); i++) {
                if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}