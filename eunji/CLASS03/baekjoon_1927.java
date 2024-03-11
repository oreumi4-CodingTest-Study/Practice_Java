package CLASS03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 최소힙 - 백준 1927(실버2)
public class baekjoon_1927 {
    static int N;
    static PriorityQueue<Node> q = new PriorityQueue<>();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N= Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(q.isEmpty()){
                    sb.append("0").append("\n");
                }else{
                    Node node = q.poll();
                    sb.append(node.x).append("\n");
                }
            }else {
                q.add(new Node(input));
            }
        }
        System.out.println(sb);
    }

    public static class Node implements Comparable<Node>{
        int x;
        public Node(int x) {
            this.x = x;
        }
        @Override
        public int compareTo(Node target){
            return (this.x>target.x)?1:-1;
        }
    }
}
