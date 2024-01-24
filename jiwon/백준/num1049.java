package silver;

import java.io.*;
import java.util.*;

public class num1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] packagePrice=new int[m];
        int[] eachPrice=new int[m];
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            packagePrice[i]=Integer.parseInt(st.nextToken());
            eachPrice[i]=Integer.parseInt(st.nextToken());
        }
        //가장 싼 값으로 정렬
        Arrays.sort(packagePrice);
        Arrays.sort(eachPrice);
        //낱개로 구매
        int allEach=n*eachPrice[0];
        //기타줄이 남게돼도 6개짜리 팩으로 구매
        int allPackage=(n/6+1)*packagePrice[0];
        //낱개+6개짜리 팩으로 구매
        int originPrice=(n/6)*packagePrice[0]+(n%6)*eachPrice[0];
        System.out.println((Math.min(Math.min(allEach,allPackage),originPrice)));
    }
}
