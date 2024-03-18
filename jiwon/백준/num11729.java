package gold;

import java.util.Scanner;

public class num11729 {
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sb.append((int)Math.pow(2,n)-1+"\n");
        hanoi(1, 3, n);

        System.out.println(sb);
    }

    public static void hanoi(int start, int end, int count) {
        if (count == 1) {
            sb.append(start+" "+end+"\n");
            return;
        }
        hanoi(start, 6 - start - end, count-1);
        sb.append(start + " " + end+"\n");
        hanoi(6-start-end, end, count-1);
    }
}
