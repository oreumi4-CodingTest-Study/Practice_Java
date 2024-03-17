package M03.W3;

import java.util.*;

public class PSG_가장_먼_노드 {
    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        System.out.println(new PSG_가장_먼_노드().solution(n, edge));
    }

    static List<Integer>[] edgeList;
    static int[] visited;

    public int solution(int n, int[][] edge) {
        edgeList = new ArrayList[n+1];
        visited = new int[n+1];
        for (int i=1; i<=n; i++) {
            edgeList[i] = new ArrayList<>();
        }
        for (int i=0; i<edge.length; i++) {
            edgeList[edge[i][0]].add(edge[i][1]);
            edgeList[edge[i][1]].add(edge[i][0]);
        }
        BFS(1);
        int maxLen = visited[1];
        for (int i=2; i<=n; i++) {
            maxLen = Math.max(maxLen, visited[i]);
        }
        int count = 0;
        for (int i=1; i<=n; i++) {
            if (maxLen == visited[i]) {
                count++;
            }
        }

        return count;
    }

    public static void BFS(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = 1;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for(int next : edgeList[now]) {
                if (visited[next] == 0) {
                    queue.add(next);
                    visited[next] = visited[now]+1;
                }
            }
        }
    }
}
