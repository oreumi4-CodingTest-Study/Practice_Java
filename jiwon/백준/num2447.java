package gold;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num2447 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> stars = makeStar(n);
        for(String star: stars){
            System.out.println(star);
        }
    }

    public static List<String> makeStar(int n){
        if(n==1){
            return List.of("*");
        }
        List<String> star = makeStar(n / 3);

        List<String> result=new ArrayList<>();
        for(int i=0;i<star.size();i++){
            result.add(star.get(i).repeat(3));
        }
        for(int i=0;i<star.size();i++){
            result.add(star.get(i)+ " ".repeat(n/3)+ star.get(i));
        }
        for(int i=0;i<star.size();i++){
            result.add(star.get(i).repeat(3));
        }

        return result;
    }
}
