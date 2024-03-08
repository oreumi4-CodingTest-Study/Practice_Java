package CLASS03;
//Z - 백준 1074 (실버1)
// 2^N X 2^N 배열에서 r행 c열의 숫자 출력(숫자는 z모양으로 입력됨)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1074 {
    static int N,r,c;
    static int result = 0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        // c+1 <= 2^(n-1) -> 왼쪽
        // 1. r+1<=2^(n-1) -> 0 -> 0
        // 2. r+1>2^(n-1) -> 4^(n-1)*2
        // c+1 > 2^(n-1) -> 오른쪽
        //  1. r+1<=2^(n-1) -> 4^(n-1) *1
        //  2. r+1>2^(n-1) -> 4^(n-1)*3
        Z(0,0,(int)Math.pow(2,N));
        System.out.println(result);
    }
    static void Z(int y, int x, int size){
        if(size == 1){
            return;
        }
        int newSize = size/2;
        if(r<y+newSize&&c<x+newSize){
            Z(y,x,newSize);
        }
        if(r<y+newSize&&c>=x+newSize){
            result +=(size*size)/4;
            Z(y,x+newSize,newSize);
        }
        if(r>=y+newSize&&c<x+newSize){
            result +=((size*size)/4)*2;
            Z(y+newSize,x,newSize);
        }
        if(r>=y+newSize&&c>=x+newSize){
            result +=((size*size)/4)*3;
            Z(y+newSize,x+newSize,newSize);
        }

    }
}
