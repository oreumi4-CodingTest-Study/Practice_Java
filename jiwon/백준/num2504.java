package gold;

import java.util.Scanner;
import java.util.Stack;

public class num2504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack=new Stack<>();
        int result=0;
        int sum=1;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c=='('){
                stack.add(c);
                sum*=2;
            }else if(c=='['){
                stack.add(c);
                sum*=3;
            }else if(c==')'){
                if(stack.isEmpty()||stack.peek()=='['){
                    System.out.println(0);
                    return;
                }
                if(str.charAt(i-1)=='('){
                    result+=sum;
                }
                stack.pop();
                sum/=2;
            }else if(c==']'){
                if(stack.isEmpty()|| stack.peek()=='('){
                    System.out.println(0);
                    return;
                }
                if(str.charAt(i-1)=='['){
                    result+=sum;
                }
                stack.pop();
                sum/=3;
            }
        }
        if(!stack.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(result);
        }

    }
}
