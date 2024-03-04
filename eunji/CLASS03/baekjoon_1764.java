package CLASS03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 1764 - 듣보잡(실버4)
public class baekjoon_1764 {
    static int N, M;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i = 0; i< N; i++){
            map.put(br.readLine(),1);
        }
        for(int i=0; i<M; i++){
            String name = br.readLine();
            if(map.getOrDefault(name,0)==1)
                list.add(name);
        }
        Collections.sort(list);
        sb.append(list.size()+"\n");
        for(String element : list){
            sb.append(element+"\n");
        }
        System.out.println(sb);

    }
}
