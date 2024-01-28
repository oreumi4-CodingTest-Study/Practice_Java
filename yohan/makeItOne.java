// [BOJ]1로 만들기(1463번) / 실버3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class makeItOne {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());

        System.out.println(MakeOne(N, 0));
    }

    static int MakeOne(int N, int count) {
        if (N < 2) {
            return count;
        }
        //재귀함수로 진행
        /*예시 ex) 10
          MakeOne(10, 0)
          Math.min(MakeOne(5,1), MakeOne(3,2))
          Math.min(Math.min(MakeOne(2,3),MakeOne(1,4)), Math.min(MakeOne(1,4),MakeOne(1,3)))
          Math.min(Math.min(Math.min(MakeOne(1,4),MakeOne(1,4)),4), 3)
          Math.min(Math.min(4,4), 3)
          count = 3
          */
        return Math.min(MakeOne(N / 2, count + 1 + (N % 2)), MakeOne(N / 3, count + 1 + (N % 3)));
    }
}

