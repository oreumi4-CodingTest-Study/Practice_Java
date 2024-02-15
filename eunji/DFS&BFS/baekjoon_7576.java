import java.io.*;
import java.awt.*;
import java.util.*;

public class baekjoon_7576 {
	static int N,M;
	static int tomato[][];
	static int count;
	static Queue<Point> q = new LinkedList<Point>();
	// 생각한 방식
	// 익은 토마토를 기준으로 bfs 실행
	// 익은 토마토 큐에 담고 큐에 빼면서 옆에 있는 토마토들을 큐에 담음 한바퀴 돌리면 count++
	// 큐에 토마토가 없어질때까지 반복
	// 큐에 토마토가 없는데 안익은 애가 있으면 -1 출력
	public static void bfs(int y, int x) {
		//상
		if(y>0) {
			if(tomato[y-1][x]==0) {
				tomato[y-1][x]=1;
				q.add(new Point(y-1,x));
			}
		}
		//하
		if(y<N-1) {
			if(tomato[y+1][x]==0) {
				tomato[y+1][x]=1;
				q.add(new Point(y+1,x));
			}
		}
		//좌
		if(x>0) {
			if(tomato[y][x-1]==0) {
				tomato[y][x-1]=1;
				q.add(new Point(y,x-1));
			}
		}
		//우
		if(x<M-1) {
			if(tomato[y][x+1]==0) {
				tomato[y][x+1]=1;
				q.add(new Point(y,x+1));
			}
		}
	}

	public static void main(String[] args) throws IOException{
		// 첫 줄에는 상자의 크기 가로 M 세로 N
		// 둘째 줄부터 N개의 줄에는 상자에 담긴 토마토의 정보
		// 1은 익은 토마토 0은 익지 않은 토마토 -1은 토마토가 들어가지 않음
		// 토마토가 익는데(하루당 상하좌우) 걸리는 일수 출력 단, 모두 익지 못하는 경우 -1 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		tomato = new int[N][M];
		for(int i=0; i<N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 0; j<M; j++) {
				tomato[i][j] = Integer.parseInt(st1.nextToken());
				if(tomato[i][j]==1) {
					q.add(new Point(i,j));
				}
			}		
		}
		count = 0;
		while(!q.isEmpty()) {
			int qSize = q.size();
			
			for(int i=0; i<qSize; i++) {
				Point p = q.poll();
				bfs(p.x,p.y);		
			}
			//만약 q에서 뺐는데 주변에 0이 없다면?
			count++;
		}
		count--;
		
		
		// 큐에 다 뺐는데 안익은게 있으면 -1 출력
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(tomato[i][j]==0) {
					count = -1;
				}
			}
		}
		System.out.println(count);

		
	}
}
