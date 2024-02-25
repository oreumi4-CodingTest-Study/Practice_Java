package bronze.구현;

import java.util.Arrays;
import java.util.Scanner;

public class num2587 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int total=0;
        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            total+=n;
            arr[i]=n;
        }
        Arrays.sort(arr);
        System.out.println(total/5);
        System.out.println(arr[2]);
    }
}
