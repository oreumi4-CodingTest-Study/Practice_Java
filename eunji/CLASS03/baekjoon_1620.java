package CLASS03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//나는야 포켓몬 마스터 이다솜-실버4
public class baekjoon_1620 {
    static int N, M;
    static Map<Integer,String> poketmonMap;
    static Map<String, Integer> reversePoketmonMap;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        // 시간 초과 문제로 hashmap을 2개 생성
        poketmonMap = new HashMap<>();
        reversePoketmonMap = new HashMap<>();
        for(int i = 1; i < N+1;i++){
            String pName = br.readLine();
            poketmonMap.put(i,pName);
            reversePoketmonMap.put(pName,i);

        }
        for(int i = 0; i < M; i++){
            String str = br.readLine();
            if(str.matches("\\d+")){ // str 이 숫자다 ? -> value값 호출
                String value = poketmonMap.get(Integer.parseInt(str));
                System.out.println(value);
            }else{ // 문자다 -> key값 찾기
                Integer numberValue = reversePoketmonMap.get(str);
                System.out.println(numberValue);
            }

        }

    }
}
