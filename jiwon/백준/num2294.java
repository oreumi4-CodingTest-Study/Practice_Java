package gold;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num2294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        int[] coin=new int[n];
        for(int i=0;i<n;i++){
            coin[i]=Integer.parseInt(br.readLine());
        }
        int[] dp=new int[k+1];
        Arrays.fill(dp,100001);
        dp[0]=0;

        for(int i=1;i<=k;i++){
            for(int value: coin){
                if(i>=value){
                    dp[i]=Math.min(dp[i-value]+1,dp[i]);
                }
            }
        }

        System.out.println(dp[k] == 100001 ? -1 : dp[k]);
    }
}
