package silver;

import java.io.*;
import java.util.*;

public class num11048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                matrix[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],0);
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                dp[i][j]=Math.max(Math.max(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1])+matrix[i-1][j-1];
            }
        }
        System.out.println(dp[n][m]);
    }
}
