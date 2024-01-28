import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        boolean isintag = false;
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            if (isintag) {
                if (Character.isLetterOrDigit(c) || c == ' ') {
                    System.out.print(c);
                }
                else if (c == '>') {
                    System.out.print(c);
                    isintag = false;
                }
            }
            else {
                if (Character.isLetterOrDigit(c)) {
                    st.push(c);
                }
                else if (c == '<'){
                    while(!st.empty()) {
                        System.out.print(st.pop());
                    }
                    System.out.print(c);
                    isintag = true;
                }
                else if (c == ' ') {
                    while(!st.empty()) {
                        System.out.print(st.pop());
                    }
                    System.out.print(c);
                }

            }

        }
        while(!st.empty()) {
            System.out.print(st.pop());
        }



    }
}
