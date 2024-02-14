package gold;

import java.io.*;
import java.util.*;

public class num1520 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int n,m;
    static int[][] matrix,dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        matrix=new int[n+1][m+1];
        dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=1;i<n+1;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<m+1;j++){
                matrix[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(dfs(1,1));
        System.out.println(Arrays.deepToString(dp));
    }
    public static int dfs(int x,int y){
        if (x==n && y==m){
            return 1;
        }
        //이미 방문한 경우 1 값 리턴
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        dp[x][y]=0;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(0<=nx && nx<=n && 0<=ny && ny<=m){
                if(matrix[x][y]>matrix[nx][ny]){
                    //만약 이미 지났던 칸를 방문했거나, 끝까지 도달하면 1더해주고 저장
                    dp[x][y]+=dfs(nx,ny);
                }
            }
        }
        return dp[x][y];
    }
}
