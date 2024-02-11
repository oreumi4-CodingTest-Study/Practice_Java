import java.io.*;
import java.util.StringTokenizer;

public class bronze1_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

//        int abmul = a*b;
//        int minmul = 1;
//        int maxdiv = Integer.MIN_VALUE;
//
//        for (int i = 1; i <= Math.min(a,b); i++) {
//            if(a%i==0 && b%i==0 && maxdiv < i){
//                maxdiv = i;
//            }
//        }
//        minmul = abmul/maxdiv;
//        System.out.println(maxdiv + "\n" + minmul);

        //유클리드 호제법
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        int remain = small;
        while(big%small != 0){
            remain = big%small;
            big = small;
            small = remain;
        }

        System.out.println(small + "\n" + a*b/small);
    }
}
