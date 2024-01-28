package silver;

import java.io.*;
import java.util.*;

public class num1946 {
    static class People{
        int paper;
        int interview;
        public People(int paper, int interview) {
            this.paper = paper;
            this.interview = interview;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            ArrayList<People> people=new ArrayList<>();

            for(int j=0;j<n;j++){
                st=new StringTokenizer(br.readLine());
                int paper=Integer.parseInt(st.nextToken());
                int interview=Integer.parseInt(st.nextToken());
                people.add(new People(paper,interview));
            }
            //서류 높은 순으로 정렬(순위이기 때문에 낮을수록 점수가 높다.)
            Collections.sort(people,(a,b)->a.paper- b.paper);

            //서류순위가 제일 높은 사람은 무조건 합격이다.
            int cnt=1;
            int top=0;
            //합격하려면 서류 순위 높은 사람보다 면접 순위가 높아야한다.
            for(int a=1;a<people.size();a++){
                if(people.get(a).interview<people.get(top).interview){
                    //만약 면접 순위가 더 높다면 top을 바꿔준다.(최대값으로 바꿔줌)
                    //다음 사람은 앞사람들의 면접 순위보다 높아야하기 때문
                    top=a;
                    //앞사람의 면접 순위보다 높기때문에 합격된다.
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}