package com.swex.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Test_4615 {
	static int[] dr = {0, -1, 1, 0, 0, -1, 1, 1, -1};
	static int[] dc = {0, 0, 0, -1, 1, 1, 1, -1, -1};
	static int b_cnt = 0;
	static int w_cnt = 0;
	static int[][] map;
	static int n, m;
	public static void main(String[] args) throws FileNotFoundException {
		// 1이 흑돌, 2가 백돌 
		System.setIn(new FileInputStream("osello"));
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			n = sc.nextInt();
			m = sc.nextInt();
			map = new int[n+1][n+1];
			map[n/2][n/2] = 2;
			map[n/2+1][n/2+1] = 2;
			map[n/2][n/2+1] = 1;
			map[n/2+1][n/2] = 1;
			for(int i=0;i<m;i++) {
				int r = sc.nextInt();
				int c = sc.nextInt();
				int check = sc.nextInt();
				map[r][c] = check;
				solve(r,c,check);	
			}
			for(int i=0;i<n+1;i++) {
				System.out.println(Arrays.toString(map[i]));
			}
			for(int i=1;i<n+1;i++) {
				for(int j=1;j<n+1;j++) {
					if(map[i][j] == 1) {
						b_cnt++;
					}else if(map[i][j] == 2){
						w_cnt++;
					}
				}
			}
			System.out.println("#"+tc+" "+b_cnt+" "+w_cnt);
			
		}

	}
	public static void solve(int row, int col, int b_or_w) {
		if(b_or_w == 1) {
			for(int k=1;k<=8;k++) {
				int s_dr = row + dr[k];
				int s_dc = col + dc[k];
				//if()
				while(s_dr >= 1 && s_dr <= n && s_dc >= 1 && s_dc <= n /*&& map[s_dr][s_dc] != 0*/) {
					if(map[s_dr][s_dc] == 2) {
						map[s_dr][s_dc] = 1;
					}else if(map[s_dr][s_dc] == 1) {
						break;
					}else if(map[s_dr][s_dc] == 0) {
						//int a = row;
						//int b = col;
						switch(k) {
							case 1:
								for(int i=s_dr-1;i<=row;i++) {
									map[i][s_dc] = 2;
								}
								break;
							case 2:
								for(int i=s_dr-1;i>=row;i--) {
									map[i][s_dc] = 2;
								}
								break;
							case 3:
								for(int i=s_dc-1;i<=col;i++) {
									map[s_dr][i] = 2;
								}
								break;
							case 4:
								for(int i=s_dc-1;i>=col;i--) {
									map[s_dr][i] = 2;
								}
								break;
							case 5:
								int a = row;
								int b = col;
								while(s_dr < a && s_dc > b) {
									map[s_dr][s_dc] = 2;
									s_dr++;
									s_dc--;
								}
								break;
							case 6:
								int a1 = row;
								int b1 = col;
								while(s_dr > a1 && s_dc > b1) {
									map[s_dr][s_dc] = 2;
									s_dr--;
									s_dc--;
								}
								break;
							case 7:
								int a2 = row;
								int b2 = col;
								while(s_dr < a2 && s_dc > b2) {
									map[s_dr][s_dc] = 2;
									s_dr--;
									s_dc++;
								}
								break;
							case 8:
								int a3 = row;
								int b3 = col;
								while(s_dr < a3 && s_dc > b3) {
									map[s_dr][s_dc] = 2;
									s_dr++;
									s_dc++;
								}
								break;
						}
						
					}
					s_dr += dr[k];
					s_dc += dc[k];

				}
			}
			

		}else if(b_or_w == 2){
			for(int k=1;k<=8;k++) {
				int s_dr = row + dr[k];
				int s_dc = col + dc[k];
				while(s_dr >= 1 && s_dr <= n && s_dc >= 1 && s_dc <= n /*&& map[s_dr][s_dc] != 0*/) {
					if(map[s_dr][s_dc] == 1) {
						map[s_dr][s_dc] = 2;
					}else if(map[s_dr][s_dc] == 2) {
						break;
					}else if(map[s_dr][s_dc] == 0) {
						switch(k) {
						case 1:
							for(int i=s_dr-1;i<=row;i++) {
								map[i][s_dc] = 2;
							}
							break;
						case 2:
							for(int i=s_dr-1;i>=row;i--) {
								map[i][s_dc] = 2;
							}
							break;
						case 3:
							for(int i=s_dc-1;i<=col;i++) {
								map[s_dr][i] = 2;
							}
							break;
						case 4:
							for(int i=s_dc-1;i>=col;i--) {
								map[s_dr][i] = 2;
							}
							break;
						case 5:
							int a = row;
							int b = col;
							while(s_dr < a && s_dc > b) {
								map[s_dr][s_dc] = 2;
								s_dr++;
								s_dc--;
							}
							break;
						case 6:
							int a1 = row;
							int b1 = col;
							while(s_dr > a1 && s_dc > b1) {
								map[s_dr][s_dc] = 2;
								s_dr--;
								s_dc--;
							}
							break;
						case 7:
							int a2 = row;
							int b2 = col;
							while(s_dr < a2 && s_dc > b2) {
								map[s_dr][s_dc] = 2;
								s_dr--;
								s_dc++;
							}
							break;
						case 8:
							int a3 = row;
							int b3 = col;
							while(s_dr < a3 && s_dc > b3) {
								map[s_dr][s_dc] = 2;
								s_dr++;
								s_dc++;
							}
							break;
					}
					break;
					}
					s_dr += dr[k];
					s_dc += dc[k];
				}
			}
				
		}
	}
}