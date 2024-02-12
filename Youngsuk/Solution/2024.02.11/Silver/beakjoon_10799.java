import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class beakjoon_10799 {
    public static void main(String[] args) throws IOException {
        int stack = 0;
        int answer = 0;
        char prev_c = ' ';

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String pattern = sc.readLine();

        for(char c: pattern.toCharArray()){
            if (c=='('){
                if (prev_c == '('){
                    stack++;
                } else{
                    answer += stack;
                }
            } else{
                if (prev_c == ')'){
                    answer+= --stack;
                }
                else {
                    answer += stack;
                }
            }
            prev_c = c;
        }
        System.out.println(answer);
    }
}

//3+4