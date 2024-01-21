package BaekJoon.Ex2587;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<5;i++){
            int x = sc.nextInt();
            list.add(x);
            sum += x;
        }

        Collections.sort(list);

        System.out.println(sum/5);
        System.out.println(list.get(2));

    }
}
