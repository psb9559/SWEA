package 디저트카페;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Solution {
	static int T, N, start_x, start_y, ans;
	static int[][] map;
	static boolean[][] visit;
	static boolean[] check;
	static int[][] dir = {{1,1}, {1,-1}, {-1,-1}, {-1,1}};
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			ans = 0;
			map = new int[N][N];
			visit = new boolean[N][N];
			check = new boolean[101];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					start_x = i;
					start_y = j;
					visit[i][j] = true;
					check[map[i][j]] = true;
					dfs(i, j, 1, 0);
					visit[i][j] = false;
					check[map[i][j]] = false;
				}
			}
			
			System.out.println("#"+tc+" "+(ans == 0 ? -1 : ans));
		}

	}
	static void dfs(int x, int y, int cnt, int d) {
		// TODO Auto-generated method stub
		if(d == 4) {
			return;
		}
		
		int dx = x + dir[d][0];
		int dy = y + dir[d][1];
		if(dx < 0 || dx >= N || dy < 0 || dy >= N) {
			return;
		}
		
		if(visit[dx][dy] || check[map[dx][dy]]) {
			if(dx == start_x && dy == start_y) {
				if(ans < cnt) {
					ans = cnt;
				}
			}
			return;
		}
		visit[dx][dy] = true;
		check[map[dx][dy]] = true;
		dfs(dx, dy, cnt+1, d);
		dfs(dx, dy, cnt+1, d+1);
		visit[dx][dy] = false;
		check[map[dx][dy]] = false;
		
		
	}

}
