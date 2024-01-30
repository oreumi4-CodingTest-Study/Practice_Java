package M01.W4;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class BOJ_20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();

        String[] inform = br.readLine().split(" ");
        int N = Integer.parseInt(inform[0]);
        int M = Integer.parseInt(inform[1]);

        // 단어별 개수 체크
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
            if (words[i].length() < M) {
                continue;
            }
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }

        Object[][] memoWords = new Object[map.size()][3];
        int i = 0;
        for (String key : map.keySet()) {
            memoWords[i][0] = map.get(key);   // 1순위 : 단어 수
            memoWords[i][1] = key.length();   // 2순위 : 단어 길이
            memoWords[i][2] = key;                              // 3순위 : 단어
            i++;
        }

        // memoWords 우선순위부터 정렬
        Arrays.sort(memoWords, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                // 1순위 비교
                if (o1[0] == o2[0]) {
                    // 1순위 같으면 2순위 비교
                    if (o1[1] == o2[1]) {
                        // 2순위 같으면 3순위 정렬 (오름차순)
                        return ((String) o1[2]).compareTo((String) o2[2]);
                    } else {
                        // 2순위 다르면 2순위 정렬 (내림차순)
                        return (int) o2[1] - (int) o1[1];
                    }
                } else {
                    // 1순위 다르면 1순위 정렬 (내림차순)
                    return (int) o2[0] - (int) o1[0];
                }
            }
        });

        for (int j = 0; j < memoWords.length; j++) {
            bw.write(memoWords[j][2] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
