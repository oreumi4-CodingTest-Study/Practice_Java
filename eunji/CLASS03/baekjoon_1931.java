package CLASS03;
// 백준 1931 - 회의실배정(실버1)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class baekjoon_1931 {
    static int N,count;
    static PriorityQueue<Edge> q = new PriorityQueue<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            q.add(new Edge(start,end));
        }
        Edge preLecture = new Edge(0,0);
        while (!q.isEmpty()){
            Edge lecture = q.poll();
            if(lecture.start >= preLecture.end){
                count++;
                preLecture = lecture;
            }
        }
        System.out.println(count);
    }
    static class Edge implements Comparable<Edge>{
        int start, end;

        Edge(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Edge e){ // 엣지 교환
            if(this.end == e.end){
                if(this.start > e.start) return 1;
            }
            if(this.end > e.end) return 1;
            else return -1;
        }

    }
}
