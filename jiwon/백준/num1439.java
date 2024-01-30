package silver;

import java.util.*;

public class num1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringTokenizer zero=new StringTokenizer(s,"1");
        StringTokenizer one=new StringTokenizer(s,"0");

        System.out.println(Math.min(zero.countTokens(), one.countTokens()));
    }
}

