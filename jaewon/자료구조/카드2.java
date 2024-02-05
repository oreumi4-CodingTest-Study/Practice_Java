//백준 2164번 '카드2' / 실버 4 / 20분 / Queue문제

import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //큐 생성
        Queue<Integer> queue = new LinkedList<>();

        //add : 큐에 원소 삽입
        for(int i=0;i<N;i++){
            queue.add(i+1);
        }
        
        //poll : 맨 위의 원소 삭제
        while(queue.size()!=1){
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
