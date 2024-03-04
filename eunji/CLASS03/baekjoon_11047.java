package CLASS03;
// 백준 11047 - 동전 0 (실버4)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11047 {
    static int N, K;
    static int[] coin;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        coin = new int[N+1];
        for(int i = 1; i < N+1; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        for(int i = N; i>0; i--){
            if(K>=coin[i]){
                cnt += K/coin[i];
                K %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}
