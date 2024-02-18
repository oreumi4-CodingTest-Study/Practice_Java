import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());
        String[] bracketsArr = new String[inputSize];
        for(int i = 0; i < inputSize; i++){
            bracketsArr[i] = br.readLine();
        }

        for(String brackets : bracketsArr){
            int leftCount = 0;
            String result = "YES";
            char[] bracketsChar = brackets.toCharArray();
            if(bracketsChar[0] == ')' || bracketsChar[bracketsChar.length-1] == '('){
                result = "NO";
            }
            else{
                for (char bracket : bracketsChar){
                    if(bracket == '('){
                        leftCount++;
                    } else if (bracket == ')') {
                        leftCount--;
                    }                    

                    if(leftCount < 0){
                        result = "NO";
                        break;
                    }
                }
                if(leftCount != 0){
                    result = "NO";
                }
            }
            System.out.println(result);
        }
    }
}
