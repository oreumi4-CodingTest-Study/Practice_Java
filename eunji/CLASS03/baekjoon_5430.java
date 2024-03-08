package CLASS03;
//AC - 백준 5430 - 골드 5
// R(뒤집기) D(삭제하기) 두가지로 연산
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 뒤집기는 속도가 기니까 한번만하자
// R -> 뒤집기
// RD -> 맨 마지막 요소 지우고 뒤집기
// RDR -> 맨 마지막 요소 지우기
// RR - -> 원본
// RDRDRDRD -> 뒤집기 필요 x -> 양옆 두 요소만 총 4개만 삭제
// 정리
// D -> n의 개수 한개씩 줄이기 마지막 index 접근 + 예외처리
//예외 처리 -> D 연산 전 n이 0이면 -> error 출력 -> R의 경우는? 일단 빼자
public class baekjoon_5430 {
    static int T;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t=0; t<T; t++) {
            String operator = br.readLine();
            int N = Integer.parseInt(br.readLine());
            // [1,2,3,4] ->9개의 요소 n+n-1+2 = 2n+1 i=1~2n
            String sArr = br.readLine();
            sArr = sArr.replaceAll("[\\[\\]]","");
            StringTokenizer st = new StringTokenizer(sArr,",");
            Deque<Integer> dq = new LinkedList<>();
            int n = st.countTokens();
            for(int i=0; i < n;i++){
                dq.add(Integer.parseInt(st.nextToken()));

            }
            boolean rOdd = false;
            boolean error = false;
            for (char c : operator.toCharArray()) {
                if (c == 'R') {
                    rOdd = !rOdd; // rOdd -> 홀수면 마지막에 뒤집기 짝수면 안뒤집기
                } else if (c == 'D') {
                    if (dq.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (rOdd) { // R boolean odd -> r 개수가 홀수면 맨 뒤에 있는거 빼기 -> 시간초과 양방향 dequeue 사용해야됨!
                        dq.removeLast();
                    } else { // 짝수면 맨 앞에 있는거 빼기
                        dq.removeFirst();
                    }
                }
            }
            // 출력 -> [2,3,4] 방식으로 해야됨 ㅇㄴ
            StringBuilder answer;
            List<Integer> arr = new ArrayList<>();
            while(!dq.isEmpty()){
                arr.add(dq.poll());
            }
            if (error) {
                answer = new StringBuilder("error");
            } else {
                answer = new StringBuilder();
                if (rOdd) {
                    Collections.reverse(arr);
                }
                if (!arr.isEmpty()) {
                    answer.append(arr.get(0));
                    for (int i = 1; i < arr.size(); i++) {
                        answer.append(",").append(arr.get(i));
                    }
                }
                answer.insert(0,"[");
                answer.append("]");
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}
