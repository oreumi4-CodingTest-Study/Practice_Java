package CLASS03;
// 비밀번호찾기(17219)/실버4
// 사이트와 비밀번호 입력받은 후 제시한 사이트의 비번 출력
// hashMap 이용
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class baekjoon_17219 {
    static int N , M;
    public static void main (String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Map<String, String> pMap = new HashMap<>();
        for(int i = 0; i <N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            String site = st1.nextToken();
            String pw = st1.nextToken();
            pMap.put(site,pw);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <M; i++){
            String key = br.readLine();
            sb.append(pMap.get(key)+"\n");
        }
        System.out.println(sb);
    }
}
