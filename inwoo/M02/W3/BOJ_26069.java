package M02.W3;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;

public class BOJ_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Boolean> map = new HashMap<>();

        map.put("ChongChong", true);

        int N = Integer.parseInt(br.readLine());
        String[] meeting = new String[2];

        for (int i = 0; i < N; i++) {
            meeting = br.readLine().split(" ");
            for (int j = 0; j < meeting.length; j++) {
                if (!map.containsKey(meeting[j])) {
                    map.put(meeting[j], false);
                }
            }

            // 둘 중 한 사람이라도 춤을 추고 있으면
            if (map.get(meeting[0]) || map.get(meeting[1])) {
                // 춤 전염
                map.put(meeting[0], true);
                map.put(meeting[1], true);
            }
        }

        int count = 0;
        for (Boolean isDance : map.values()) {
            if (isDance) {
                count++;
            }
        }

        bw.write(Integer.toString(count));

        bw.flush();
        bw.close();
    }
}
