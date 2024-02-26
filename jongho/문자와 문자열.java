import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int N = scanner.nextInt()-1;
        scanner.close();

        System.out.println(string.charAt(N));
        
    }
}
