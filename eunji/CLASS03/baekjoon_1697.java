package CLASS03;
//백준 1697 - 숨바꼭질 (실버1)
//수빈이의 위치가 X일 때 걷는다면
// 1. 1초 후에 X-1 또는 X+1로 이동
// 2. 또는 1초 후에 2*X로 이동
// 수빈이와 동생의 위치가 주어졌을때, 찾을 수 있는 가장 빠른 시간 구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baekjoon_1697 {
    static int N,K;
    static int visited[] = new int[100001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int result = bfs(N);
        System.out.println(result);
    }
    static int bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        int index = node;
        int n = 0;
        visited[index]=1; // 방문 배열의 value 값 -> count
        while(q.isEmpty() == false){
            n = q.remove();
            if(n==K){
                return visited[n]-1;
            }
            if(n-1>=0&&visited[n-1]==0) {// 방문 안했고 현재 위치가 1보다 크면
                visited[n-1] = visited[n]+1; // n-1 노드의 count = n+1
                q.add(n-1);
            }
            if(n+1<=100000&&visited[n+1]==0){ // 방문 안했고 현재 위치가 100000(최대 수)보다 작을때
                visited[n+1] = visited[n]+1; // n+1 노드의 count = n+1
                q.add(n+1);
            }
            if(2*n <=100000&&visited[2*n]==0){
                visited[2*n] = visited[n]+1;
                q.add(2*n);
            }
        }
        return -1;

    }
}
