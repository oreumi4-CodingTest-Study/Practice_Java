package silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());

        int[][] arr=new int[n][2];

        for (int i = 0; i < n; i++) {
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            arr[i][0]=a;
            arr[i][1]=b;
        }

        Arrays.sort(arr,(a,b) -> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
