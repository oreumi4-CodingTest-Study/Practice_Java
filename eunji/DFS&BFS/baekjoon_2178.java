import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 백준 2178 - 미로탐색 실버 1
// 이동할 때 지나야하는 최소 칸 수
public class baekjoon_2178 {
    static int N, M ;
    static int[][] map;
    static Queue<Point> q = new LinkedList<>();
    static int[][] count;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        count = new int[N][M];
        visited = new boolean[N][M];
        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = line.charAt(j)-'0';
            }
        }

        int ans = bfs(0,0);
        System.out.println(ans);
    }
   static int bfs(int x,int y){
        visited[x][y] = true;
        count[x][y] = 1;
        q.add(new Point(x,y));
        while (!q.isEmpty()){
            Point p = q.poll();
            for(int i = 0; i <4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(nx>=N||ny>=M||nx<0||ny<0)
                    continue;
                if(map[nx][ny]==1&&!visited[nx][ny]){
                    count[nx][ny] = count[p.x][p.y]+1;
                    if(nx==N-1&&ny==M-1){
                        return count[nx][ny];
                    }
                    visited[nx][ny] = true;
                    q.add(new Point(nx,ny));
                }
            }


        }
        return -1;
   }
}
