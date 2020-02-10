package com.swex.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test_1861 {
	static int[][] map;
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	static int cnt;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("1861.txt"));
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			int MAX = 1;
			int min = 10001;
			int N = sc.nextInt();
			int[][] map = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int[] num = new int[1000001];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
						cnt = 0;
						int first = map[i][j];
						sol(map, i, j, N, first);
						cnt++;
						num[first] = cnt;
				}
			}
			int M = N*N;
			for(int i=0;i<M;i++) {
				if(MAX < num[i]) {
					MAX = num[i];
					min = i;
				}
			}
			
			System.out.println("#"+tc+" "+min+" "+MAX);
			min = 10001;
			MAX = 1;
			
		}

	}

	private static void sol(int[][] map, int x, int y, int size, int first) {
		for(int k=1;k<=4;k++) {
			int s_dr = x + dr[k];
			int s_dc = y + dc[k];
			if(s_dr >= 0 && s_dr < size && s_dc >= 0 && s_dc < size && map[s_dr][s_dc] - first == 1) {
				cnt++;
				sol(map, s_dr, s_dc, size, map[s_dr][s_dc]);
			}
		}
		
	}

}
