package Solution.March_2nd.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* 2798번 블랙잭 브론즈2
각 카드에는 양의 정수가 쓰여있고, 딜러가 N장의 카드를 모두 숫자가 보이도록 바닥에 놓은 후, 숫자 M을 크게 외친다
제한 시간안에 N장의 카드중에서 3장의 카드를 골라야 한다.
플레이어가 고른 카드의 합은 M을 넘지 않으면서 M가 최대한 가깝게 만들어야 한다.
N장의 카드에 써져있는 숫자가 주어졌을때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하라.
*/
public class beakjoon_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cardIndexes = br.readLine().split(" ");
        int N = Integer.parseInt(cardIndexes[0]);
        int M = Integer.parseInt(cardIndexes[1]);

        List<Integer> cardList = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        cardList.sort(Collections.reverseOrder());

        int maxSum = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    int sum = cardList.get(i)+cardList.get(j)+cardList.get(k);
                    if (sum<=M && maxSum < sum){
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
