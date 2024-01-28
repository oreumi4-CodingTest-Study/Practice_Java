package silver;

import java.io.*;
import java.util.*;

public class num2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        int m=Integer.parseInt(br.readLine());

        int min=1;
        int max= Collections.max(arr);
        int answer=0;
        while(min<=max){
            int mid=(min+max)/2;
            int total=0;
            for(int i=0;i<n;i++){
                if(arr.get(i)<mid){
                    total+=arr.get(i);
                }else{
                    total+=mid;
                }
            }
            if(total>m){
                max=mid-1;
            }else{
                min=mid+1;
                answer=mid;
            }

        }
        System.out.println(answer);
    }
}
