package gold;

import java.io.*;
import java.util.*;

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class num11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Meeting[] meeting = new Meeting[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meeting[i] = new Meeting(start, end);
        }
        //시작 시간 기준으로 오름차순 정렬
        //시작 시간 같으면 종료 시간 기준으로 오름차순
        Arrays.sort(meeting,(m1,m2)->m1.start==m2.start ? m1.end- m2.end : m1.start-m2.start);

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(meeting[0].end);
        for(int i=1;i<n;i++){
            if (pq.peek()<=meeting[i].start){
                pq.poll();
            }
            pq.offer(meeting[i].end);
        }
        System.out.println(pq.size());
    }
}
