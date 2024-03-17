package M03.W3;

import java.util.*;

public class PSG_가장_많이_받은_선물 {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        System.out.println(new PSG_가장_많이_받은_선물().solution(friends, gifts));
    }

    public int solution(String[] friends, String[] gifts) {
        Map<String, List<String>> send = new HashMap<>();
        Map<String, List<String>> receive = new HashMap<>();
        Map<String, Integer> counts = new HashMap<>();

        for (int i=0; i<friends.length; i++) {
            send.put(friends[i], new ArrayList<>());
            receive.put(friends[i], new ArrayList<>());
            counts.put(friends[i], 0);
        }

        for (int i=0; i<gifts.length; i++) {
            String[] gift = gifts[i].split(" ");
            send.get(gift[0]).add(gift[1]);
            receive.get(gift[1]).add(gift[0]);
        }

        for (int a=0; a<friends.length-1; a++) {
            for (int b=a+1; b<friends.length; b++) {
                int sendAtoB = 0;   // A가 B에게 보낸 선물 개수
                int sendBtoA = 0;   // B가 A에게 보낸 선물 개수
                for (String frend : send.get(friends[a])) {
                    if (frend.equals(friends[b])) {
                        sendAtoB++;
                    }
                }
                for (String frend : send.get(friends[b])) {
                    if (frend.equals(friends[a])) {
                        sendBtoA++;
                    }
                }

                int giftA = send.get(friends[a]).size() - receive.get(friends[a]).size();   // A 선물지수
                int giftB = send.get(friends[b]).size() - receive.get(friends[b]).size();   // B 선물지수

                if (sendAtoB > sendBtoA) {
                    counts.put(friends[a], counts.get(friends[a]) + 1);
                } else if (sendAtoB < sendBtoA) {
                    counts.put(friends[b], counts.get(friends[b]) + 1);
                } else {
                    if (giftA > giftB) {
                        counts.put(friends[a], counts.get(friends[a]) + 1);
                    } else if (giftA < giftB) {
                        counts.put(friends[b], counts.get(friends[b]) + 1);
                    }
                }
            }
        }

        int maxCount = 0;
        for (int count : counts.values()) {
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
