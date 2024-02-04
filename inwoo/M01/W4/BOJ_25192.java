package M01.W4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;

public class BOJ_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(bf.readLine());
        String[] inform = new String[N];
        for (int i = 0; i < N; i++) {
            inform[i] = bf.readLine();
        }

        int gomCount = 0;
        for (int i = 0; i < N; i++) {
            if (inform[i].equals("ENTER")) {
                map.clear();
                continue;
            } else if (!map.containsKey(inform[i])) {
                map.put(inform[i], 1);
                gomCount++;
            }
        }
        bw.write(Integer.toString(gomCount));

        bw.flush();
        bw.close();
    }
}
