package Solution.March_1st.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

// Silver 4 덱
public class beakjoon_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> deque = new LinkedList<>();
        int answer = 0;
        int data = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] choice = br.readLine().split(" ");
            if (choice.length > 1)
                data = Integer.parseInt(choice[1]);
            switch (choice[0]){
                case "push_front":
                    deque.addFirst(data);
                    continue;
                case "push_back":
                    deque.addLast(data);
                    continue;
                case "pop_front":
                    if (deque.isEmpty())
                        answer = -1;
                    else
                      answer = deque.pollFirst();
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        answer = -1;
                    }
                    else
                        answer = deque.pollLast();
                    break;
                case "size":
                    answer = deque.size();
                    break;
                case "empty":
                    if (deque.isEmpty())
                        answer = 1;
                    else
                        answer = 0;
                    break;
                case "front":
                    if (deque.isEmpty())
                        answer = -1;
                    else
                       answer = deque.peekFirst();
                    break;
                case "back":
                    if (deque.isEmpty())
                        answer = -1;
                    else
                        answer = deque.peekLast();
                    break;
            }
            System.out.println(answer);
        }
    }
}
