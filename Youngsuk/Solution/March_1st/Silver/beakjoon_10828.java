package Solution.March_1st.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//Silver4 스택
public class beakjoon_10828 {
    public static void main(String[] args) throws IOException {

        Stack stack = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String[] choice = br.readLine().split(" ");
            switch (choice[0]) {
                case "push":
                    stack.push(Integer.parseInt(choice[1]));
                    continue;
                case "top":
                    if (stack.isEmpty())
                        answer = -1;
                    else
                        answer = (int) stack.peek();
                    break;
                case "pop":
                    if (stack.isEmpty())
                        answer = -1;
                    else
                        answer = (int) stack.pop();
                    break;
                case "empty": {
                    if (stack.isEmpty()) {
                        answer = 1;
                    } else {
                        answer = 0;
                    }
                    break;
                }
                case "size":
                    answer = stack.size();
                    break;
            }
            System.out.println(answer);
        }
    }
}
