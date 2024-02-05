package gold;

import java.io.*;
import java.util.*;

public class num1744 {
    static int total=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer> minus=new ArrayList<>();
        ArrayList<Integer> plus=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            if(num>1){
                plus.add(num);
            }else if(num<=0){
                minus.add(num);
            }else{
//              1일때는 곱셈보다 그냥 더하는게 더 좋다
                total+=num;
            }
        }
        Collections.sort(plus, (a,b)->b-a);
        Collections.sort(minus);
        getTotal(plus);
        getTotal(minus);

        System.out.println(total);
    }
    static void getTotal(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i+=2){
            if(i+1>=arr.size()){
                total+=arr.get(i);
            }else{
                total+=arr.get(i)*arr.get(i+1);
            }
        }
    }
}
