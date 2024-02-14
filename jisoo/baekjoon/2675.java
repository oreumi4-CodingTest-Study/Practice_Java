import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase= Integer.parseInt(br.readLine());

        String[][] repeatText = new String[testCase][2];
        for (int i = 0; i < repeatText.length; i++) {
            String[] text = br.readLine().split(" ");
            repeatText[i][0] = text[0];
            repeatText[i][1] = text[1];
        }
        
        for (int i = 0; i < repeatText.length; i++) {
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < repeatText[i][1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(repeatText[i][0]); k++) {
                    result.append(repeatText[i][1].charAt(j));
                }
            }
            System.out.println(result);
        }
    }
}
