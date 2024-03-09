package M03.W2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PGS_게임_맵_최단거리 {
    public static void main(String[] args) {
     /*[[1,0,1,1,1],
        [1,0,1,0,1],
        [1,0,1,1,1],
        [1,1,1,0,1],
        [0,0,0,0,1]]*/
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };

        System.out.println(solution(maps));
    }

    /*********************************************/

    public static boolean[][] visited;
    public static int[] dr = {0, 1, 0, -1};
    public static int[] dc = {1, 0, -1, 0};
    public static int N;
    public static int M;

    public static int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        visited = new boolean[N][M];

        return BFS(maps, 0, 0);
    }

    public static int BFS(int[][] maps, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[y][x] = true;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = now[0] + dr[i];
                int nextY = now[1] + dc[i];
                if (0 <= nextX && nextX < M && 0 <= nextY && nextY < N) {
                    if (maps[nextY][nextX] != 0 && !visited[nextY][nextX]) {
                        visited[nextY][nextX] = true;
                        maps[nextY][nextX] = maps[now[1]][now[0]] + 1;
                        queue.add(new int[]{nextX, nextY});
                    }
                }
            }
        }

        printArr(maps);

        if (!visited[N - 1][M - 1]) {
            return -1;
        } else {
            return maps[N - 1][M - 1];
        }
    }

    public static void printArr(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }
}
