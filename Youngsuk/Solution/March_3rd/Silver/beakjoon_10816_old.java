package Solution.March_3rd.Silver;


import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class beakjoon_10816_old {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> nList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nList.add(Integer.parseInt(st.nextToken()));
        }

        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int num : nList) {
            cntMap.putIfAbsent(num, 0);
            cntMap.put(num, cntMap.get(num) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        List<Integer> mList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            mList.add(Integer.parseInt(st2.nextToken()));
        }

        for (int num : mList) {
            System.out.print(cntMap.getOrDefault(num,0) +" ");
        }
    }
}