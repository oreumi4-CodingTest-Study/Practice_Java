// [BOJ]터렛(1002번) / 실버3

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(circleMeetPoint(x1, y1, r1, x2, y2, r2));
        }
    }

    public static int circleMeetPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
        int d = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        int circleSub = (r1 - r2)*(r1 - r2);
        int circleSum = (r1 + r2)*(r1 + r2);

        if (d == 0) {
            if (r1 == r2) {
                return -1; // 두 원이 동심원이며 반지름이 같을 때
            } else {
                return 0; // 두 원이 동심원이며 반지름이 다를 때
            }
        } else if (d < circleSub || circleSum < d) {
            return 0; // 두 원이 완전히 포함된 경우
        } else if (d == circleSub || d == circleSum) {
            return 1; // 두 원이 한 점에서 만나는 경우
        } else if (circleSub < d && d < circleSum) {
            return 2; // 두 원이 두 점에서 만나는 경우
        } else {
            return 0; // 그 외의 경우
        }
    }
}