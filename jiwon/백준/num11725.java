import java.io.*;
import java.util.*;

public class num11725 {
    static ArrayList<Integer> tree[];
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());

        tree=new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            tree[i]=new ArrayList<>();
        }

        result=new int[n+1];
        Arrays.fill(result,0);
        result[1]=1;

        for(int i=0;i<n-1;i++){
            st=new StringTokenizer(br.readLine());
            int node1=Integer.parseInt(st.nextToken());
            int node2=Integer.parseInt(st.nextToken());
            tree[node1].add(node2);
            tree[node2].add(node1);
        }

        bfs(1);

        for(int i=2;i<n+1;i++){
            System.out.println(result[i]);
        }
    }
    static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while (!q.isEmpty()){
            int x=q.poll();
            for (int i: tree[x]){
                if (result[i] == 0){
                    result[i]=x;
                    q.add(i);
                }
            }
        }
    }
}
