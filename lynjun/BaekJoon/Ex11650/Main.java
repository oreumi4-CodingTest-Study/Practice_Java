package BaekJoon.Ex11650;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int[][] arr= new int[s][2];

        for(int i = 0; i<s;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr,(x, y) ->
                x[0] == y[0] ? x[1] - y[1] : x[0] - y[0]
        );

        for (int[] ints : arr) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}
