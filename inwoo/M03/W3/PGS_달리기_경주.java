package M03.W3;

import java.util.*;

public class PGS_달리기_경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(new PGS_달리기_경주().solution(players, callings)));
    }

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        int n = players.length;

        for (int i=0; i<n; i++) {
            map.put(players[i], i);
        }
        for (String calling : callings) {
            int idx = map.get(calling);
            players[idx] = players[idx - 1];
            players[idx-1] = calling;
            map.put(calling, map.get(calling) - 1);
            map.put(players[idx], map.get(players[idx]) + 1);
        }
        return players;
    }
}
