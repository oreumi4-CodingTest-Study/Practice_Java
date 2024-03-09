package M03.W2;

import java.util.*;

public class PGS_석유_시추 {
    public static void main(String[] args) {
        int[][] land = {
                {0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 1, 1}
        };

        System.out.println(solution(land));
    }

    /*****************************************************/

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static ArrayList<ArrayList<int[]>> oilGroup;
    static ArrayList<int[]> oil;
    static boolean[] visitedOil;
    static boolean[][] visited;
    static int N, M, sNum;

    public static int solution(int[][] land) {
        N = land.length;        // 세로 길이
        M = land[0].length;     // 가로 길이
        visited = new boolean[N][M];

        sNum = 1;
        oilGroup = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (land[i][j] != 0 && !visited[i][j]) {
                    BFS(land, i, j);
                    sNum++;
                    oilGroup.add(oil);
                }
            }
        }

        int maxOil = 0;
        for (int j = 0; j < M; j++) {       // 시추 위치
            visitedOil = new boolean[oilGroup.size() + 1];
            int oilSum = 0;
            for (int i = 0; i < N; i++) {   // 시추 깊이
                if (land[i][j] != 0 && !visitedOil[land[i][j]]) {
                    visitedOil[land[i][j]] = true;
                    oilSum += oilGroup.get(land[i][j]-1).size();
                }
            }
            maxOil = Math.max(maxOil, oilSum);
        }

        return maxOil;
    }

    public static void BFS(int[][] land, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        oil = new ArrayList<>();
        int[] start = {i, j};
        queue.add(start);
        oil.add(start);
        visited[i][j] = true;
        land[i][j] = sNum;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int d = 0; d < 4; d++) {
                int x = now[0] + dx[d];
                int y = now[1] + dy[d];
                if (0 <= x && x < N && 0 <= y && y < M) {
                    if (land[x][y] != 0 && !visited[x][y]) {
                        land[x][y] = sNum;
                        visited[x][y] = true;
                        int[] temp = {x, y};
                        oil.add(temp);
                        queue.add(temp);
                    }
                }
            }
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }
}
