import java.awt.*;
import java.util.*;

public class programmers_pccp_2 {
    static int n,m;
    static boolean[][] visited;
    static boolean[] cList;
    static int[] col;
    static int[] dx={-1,0,1,0};
    static int[] dy ={0,-1,0,1};
    static Queue<Point> q = new LinkedList<>();
    public static void main(String[]args) {
        int[][] land = {
                {0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 1, 1}
        };
        int answer = 0;
        n = land.length;
        m = land[0].length;
        visited = new boolean[n][m];
        col = new int[m];
        cList = new boolean[m];
        for(int i =0; i <n; i++){
            for(int j=0; j<m; j++){
                if(land[i][j]==1&&!visited[i][j]){
                    cList[j]=true;
                    visited[i][j] = true;
                    q.add(new Point(i,j));
                    bfs(i,j,land);
                }
            }
        }
        for(int i=0; i<m; i++){
            System.out.println(col[i]);
            answer = col[i]>answer?col[i]:answer;
        }

        System.out.println(answer);
    }
    public static void bfs(int x,int y,int[][] land){
        int count = 0;
        while(!q.isEmpty()){
            Point p = q.poll();
            count++;
            for(int i=0; i<4; i++){
                int nx = p.x+dx[i];
                int ny = p.y+dy[i];
                if(nx>=n||ny>=m||nx<0||ny<0)
                    continue;
                if(land[nx][ny]==1&&!visited[nx][ny]){
                    cList[ny]=true;
                    visited[nx][ny]=true;
                    q.add(new Point(nx,ny));
                }
            }
        }
        for(int i=0; i<m; i++){
            if(cList[i]){
                col[i]+=count;
                System.out.println(i+","+col[i]);
            }
        }
        Arrays.fill(cList, false);

    }
}
