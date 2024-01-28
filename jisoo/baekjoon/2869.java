import java.util.Scanner;

public class bronze_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int V = 0;
        int result = 0;

        A = sc.nextInt();
        B = sc.nextInt();
        V = sc.nextInt();

        if(A==V){
            result = 1;
        }
        else{
            result = (int)Math.ceil(((double)(V-A)/(A-B)))+1;
        }
        System.out.println(result);
    }
}
