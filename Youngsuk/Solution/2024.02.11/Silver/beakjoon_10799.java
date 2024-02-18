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
                if (prev_c == '('){ // (( : 새로운 막대기가 추가되는 경우 | stack 1 증가
                    stack++;
                }
                else { // )( : 레이저 이후에 새로운 막대기가 추가 or 막대기가 끝난 후에 새로운 막대기가 온 것  둘 중 뭔지 지금은 알 수 없다.
                    // 두 경우 다 1번으로 stack은 추가되기 때문에 무시
                }
            } else{ //c == ')'
                if (prev_c == ')'){ // )) : 막대기가 하나 끝나서 줄어드는 경우 | stack 1줄이고 1만큼 추가
                    answer+= 1;
                    stack--;
                }
                else { // () : 레이저 | 지금까지의 stack만큼 추가
                    answer+= stack;
                }
            }
            prev_c = c;
        }
        System.out.println(answer);
    }
}