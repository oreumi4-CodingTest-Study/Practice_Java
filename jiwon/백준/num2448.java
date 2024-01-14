import java.util.Scanner;

public class num2448 {
    static String[] stars;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        stars=new String[n];
        String[] result = makeStar(n);
        for(String s: result){
            System.out.println(s);
        }
    }
    static String[] makeStar(int n){
        if (n==3){
            return new String[] {"  *  "," * * ","*****"};
        }
        String[] L=makeStar(n/2);
        String[] result=new String[n];
        for (int i=0;i<L.length;i++){
            result[i]=" ".repeat(n/2)+L[i]+" ".repeat(n/2);
        }
        for (int i=0;i<L.length;i++){
            result[i+(n/2)]=L[i]+" "+L[i];
        }
        return result;
    }
}
