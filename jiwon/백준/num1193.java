package silver;

import java.util.Scanner;

public class num1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int level = 1;
        while (n > level) {
            n -= level;
            level++;
        }
        StringBuilder sb = new StringBuilder();
        if (level % 2 == 0) {
            sb.append(n);
            sb.append("/");
            sb.append(level-n+1);
        } else {
            sb.append(level - n + 1);
            sb.append("/");
            sb.append(n);
        }
        System.out.println(sb);
    }
}
