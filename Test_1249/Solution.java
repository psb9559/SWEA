package Test_1249;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

class Pair{
	int r, c, sum;
	Pair(int r, int c, int sum){
		this.r = r;
		this.c = c;
		this.sum = sum;
	}
}
public class Solution {
	static int T, N, ans;
	static int[][] map;
	static int[][] cost;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("º¸±Þ·Î.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			map = new int[N][N];
			cost = new int[N][N];
			for(int i=0;i<N;i++) {
				String s = sc.next();
				for(int j=0;j<N;j++) {
					map[i][j] = Integer.parseInt(s.substring(j, j+1));
				}
			}
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			bfs(0, 0, 0);
			System.out.println("#"+tc+" "+cost[N-1][N-1]);
		}

	}

	static void bfs(int x, int y, int sum) {
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(x, y, sum));
		while(!queue.isEmpty()) {
			Pair p = queue.poll();
			for(int i=0;i<4;i++) {
				int nx = p.r + dr[i];
				int ny = p.c + dc[i];
				if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
					int n_cost = p.sum + map[nx][ny];
					if(n_cost < cost[nx][ny]) {
						cost[nx][ny] = n_cost;
						queue.add(new Pair(nx, ny, n_cost));
					}
					
				}
			}
		}
		
		
	}
	

}
