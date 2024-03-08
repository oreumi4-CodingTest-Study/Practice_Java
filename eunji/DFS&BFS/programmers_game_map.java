import java.util.*;
import java.awt.*;
public class programmers_game_map {
    static int n,m;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][] count;
    static boolean[][]visited;
    static Queue<Point> q = new LinkedList<>();
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        count = new int[n][m];
        answer= bfs(0,0,maps);
        System.out.println(answer);
    }
    public static int bfs(int x,int y,int[][] map){
        visited[x][y] = true;
        count[x][y]++;
        q.add(new Point(x,y));
        while(!q.isEmpty()){
            Point p = q.poll();
            int x1 = p.x;
            int y1 = p.y;
            if(x1 == n-1&&y1==m-1)return count[x1][y1];
            for(int i =0; i < 4; i++){
                int nx = x1+dx[i];
                int ny = y1+dy[i];
                if(nx>=n||ny>=m||nx<0||ny<0)
                    continue;
                if(map[nx][ny]==1&&!visited[nx][ny]){
                    visited[nx][ny] = true;
                    count[nx][ny] = count[x1][y1]+1;
                    q.add(new Point(nx,ny));
                }
            }
        }

        return -1;
    }

}

