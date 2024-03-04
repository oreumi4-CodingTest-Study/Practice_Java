package Solution.March_1st.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//Silver 4 큐
public class beakjoon_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        int last = 0;

        for (int i = 0; i < N; i++) {
            String[] choice = br.readLine().split(" ");
            switch (choice[0]) {
                case "push":
                    queue.offer(Integer.parseInt(choice[1]));
                    last = Integer.parseInt(choice[1]);
                    continue;
                case "pop":
                    if (queue.isEmpty())
                        answer = -1;
                    else
                        answer = queue.poll();
                    break;
                case "size":
                    answer = queue.size();
                    break;
                case "empty":
                    if (queue.isEmpty())
                        answer = 1;
                    else
                        answer = 0;
                    break;
                case "front":
                    if (queue.isEmpty())
                        answer = -1;
                    else
                        answer = queue.peek();
                    break;
                case "back":
                    if (queue.isEmpty())
                        answer = -1;
                    else
                        answer = last;
                    break;
            }
            System.out.println(answer);
        }
    }
}
