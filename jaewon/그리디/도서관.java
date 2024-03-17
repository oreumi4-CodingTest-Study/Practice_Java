//백준 1461번 '도서관' / 골드 4 / 100분 / greedy

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> l = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++)
            l.add(Integer.parseInt(st.nextToken()));

        Collections.sort(l);

        //절대값 정렬
        if(Math.abs(l.get(0)) < Math.abs(l.get(l.size()-1)))
            Collections.reverse(l);

        int cnt = 0;
        //음수 양수가 바뀔 경우
        boolean changed = false;

        int num = 0;
        while(!l.isEmpty()){
            int firstNum = 0;
            for(int i = 0; i<M; i++) {
                int first = l.remove(0);

                if(i == 0)
                    firstNum += first;

                if (l.isEmpty())
                    break;

                int second = l.remove(0);
                l.add(0, second);

                //음수 양수가 바뀔 때
                if ((first < 0 && second > 0) || (first > 0 && second < 0)) {
                    changed = true;
                    break;
                }
            }
            //가장 멀리 있는 책을 정리하여 다시 오지 않아도 될 때
            if (num == 0)
                cnt += Math.abs(firstNum);
            //다시 0으로 돌아와야 할 때
            else
                cnt += Math.abs(firstNum) * 2;

            num++;
            if(changed)
                break;
        }

        //부호가 바뀌었을 경우
        if(changed) {
            Collections.reverse(l);

            while(!l.isEmpty()){
                int firstNum = 0;
                for(int i = 0; i<M; i++) {
                    int first = l.remove(0);

                    if(i == 0)
                        firstNum = first;
                    if (l.isEmpty())
                        break;
                }

                cnt += Math.abs(firstNum) * 2;
            }
        }

        System.out.println(cnt);
    }
}
