package Test_1226;

import java.util.*;
class Pair{
	int r, c;
	Pair(int r, int c){
		this.r = r;
		this.c = c;
	}
}
public class Solution {
	static int N, sx, sy, ans;
	static int[][] map;
	static boolean flag;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			N = sc.nextInt();
			map = new int[16][16];
			flag = false;
			for(int i=0;i<16;i++) {
				String s = sc.next();
				for(int j=0;j<16;j++) {
					map[i][j] = Integer.parseInt(s.substring(j, j+1));
					if(map[i][j] == 2) {
						sx = i;
						sy = j;
					}
				}
			}
			ans = 0;
			bfs(sx, sy);
			System.out.println("#"+tc+" " + ans);
			
		}

	}
	static void bfs(int x, int y) {
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(x, y));
		while(!queue.isEmpty()) {
			Pair p = queue.poll();
			for(int i=0;i<4;i++) {
				int nx = p.r + dr[i];
				int ny = p.c + dc[i];
				if(map[nx][ny] != 1 && nx >= 0 && nx < 16 && ny >= 0 && ny < 16) {
					if(map[nx][ny] == 3) {
						ans = 1;
						return;
					}
					map[nx][ny] = 1;
					queue.add(new Pair(nx, ny));
					
				}
			}
		}
		
		
	}

}
