import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int index = 0;

        // 입력값이 없을때까지 index를 증가
        while (sc.hasNext()) {
            sc.next();
            index++;
        }
        System.out.println(index);
    }
}