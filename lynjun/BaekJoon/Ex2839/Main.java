package BaekJoon.Ex2839;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        while (true){
            if(n%5 ==0){
                cnt += n/5;
                break;
            }else {
                n -= 3;
                cnt += 1;
            }
            if(n<0){
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);

    }
}
