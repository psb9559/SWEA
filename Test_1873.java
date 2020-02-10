package com.swex.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test_1873 {
	static int r, c;
	static char[][] map;
	static char[] move;
	static int[] dr = {0, -1, 1, 0, 0};
	static int[] dc = {0, 0, 0, -1, 1};
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("1873.txt"));
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			r = sc.nextInt();
			c = sc.nextInt();
			map = new char[r][c];
			for(int i=0;i<r;i++) {
				String s = sc.next();
				for(int j=0;j<c;j++) {
					map[i][j] = s.charAt(j);
				}
			}

			int nr = 0, nc = 0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(map[i][j] == '<' || map[i][j] == '>' || map[i][j] == 'v' || map[i][j] == '^') {
						nr = i;
						nc = j;
					}
				}
			}
			
			int a_size = sc.nextInt();
			move = new char[a_size];
			String s2 = sc.next();
			for(int i=0;i<a_size;i++) {
				move[i] = s2.charAt(i);		
			}
			//int s_dr = nr;
			//int s_dc = nc;
			for(int i=0;i<a_size;i++) {
				char tmp = move[i];
				int s_dr = nr;
				int s_dc = nc;
				switch(tmp) {
					case 'U':
                        map[nr][nc] = '^';
						s_dr += dr[1];
						s_dc += dc[1];
						if(s_dr >= 0 && s_dr < r && s_dc >= 0 && s_dc < c) {
							if(map[s_dr][s_dc] == '.') {
								map[nr][nc] = '.';
								map[s_dr][s_dc] = '^';
							}else {
								s_dr -= dr[1];
								s_dc -= dc[1];
							}

						}else {
							s_dr -= dr[1];
							s_dc -= dc[1];						
						}
						nr = s_dr;
						nc = s_dc;
						break;
					case 'D':
                        map[nr][nc] = 'v';
						s_dr += dr[2];
						s_dc += dc[2];
						if(s_dr >= 0 && s_dr < r && s_dc >= 0 && s_dc < c) {
							if(map[s_dr][s_dc] == '.') {
								map[nr][nc] = '.';
								map[s_dr][s_dc] = 'v';
							}else {
								s_dr -= dr[2];
								s_dc -= dc[2];
							}

						}else {
							s_dr -= dr[2];
							s_dc -= dc[2];						
						}
						nr = s_dr;
						nc = s_dc;
						break;
					case 'L':
                        map[nr][nc] = '<';
						s_dr += dr[3];
						s_dc += dc[3];
						if(s_dr >= 0 && s_dr < r && s_dc >= 0 && s_dc < c) {
							if(map[s_dr][s_dc] == '.') {
								map[nr][nc] = '.';
								map[s_dr][s_dc] = '<';
							}else {
								s_dr -= dr[3];
								s_dc -= dc[3];
							}

						}else {
							s_dr -= dr[3];
							s_dc -= dc[3];						
						}
						nr = s_dr;
						nc = s_dc;
						break;
					case 'R':
                        map[nr][nc] = '>';
						s_dr += dr[4];
						s_dc += dc[4];
						if(s_dr >= 0 && s_dr < r && s_dc >= 0 && s_dc < c) {
							if(map[s_dr][s_dc] == '.') {
								map[nr][nc] = '.';
								map[s_dr][s_dc] = '>';
							}else {
								s_dr -= dr[4];
								s_dc -= dc[4];
							}

						}else {
							s_dr -= dr[4];
							s_dc -= dc[4];						
						}
						nr = s_dr;
						nc = s_dc;
						break;
					case 'S':
						if(map[nr][nc] == '^') {
							int k_dr = nr + dr[1];
							int k_dc = nc + dc[1];
							while(k_dr >= 0 && k_dr < r && k_dc >= 0 && k_dc < c) {
								if(map[k_dr][k_dc] == '#') {
									break;
								}else if(map[k_dr][k_dc] == '*') {
									map[k_dr][k_dc] = '.';
                                    break;
								}
								k_dr += dr[1];
								k_dc += dc[1];
							}
						}else if(map[nr][nc] == 'v') {
							int k_dr = nr + dr[2];
							int k_dc = nc + dc[2];
							while(k_dr >= 0 && k_dr < r && k_dc >= 0 && k_dc < c) {
								if(map[k_dr][k_dc] == '#') {
									break;
								}else if(map[k_dr][k_dc] == '*') {
									map[k_dr][k_dc] = '.';
                                    break;
								}
								k_dr += dr[2];
								k_dc += dc[2];
							}
						}else if(map[nr][nc] == '<') {
							int k_dr = nr + dr[3];
							int k_dc = nc + dc[3];
							while(k_dr >= 0 && k_dr < r && k_dc >= 0 && k_dc < c) {
								if(map[k_dr][k_dc] == '#') {
									break;
								}else if(map[k_dr][k_dc] == '*') {
									map[k_dr][k_dc] = '.';
                                    break;
								}
								k_dr += dr[3];
								k_dc += dc[3];
							}
						}else if(map[nr][nc] == '>') {
							int k_dr = nr + dr[4];
							int k_dc = nc + dc[4];
							while(k_dr >= 0 && k_dr < r && k_dc >= 0 && k_dc < c) {
								if(map[k_dr][k_dc] == '#') {
									break;
								}else if(map[k_dr][k_dc] == '*') {
									map[k_dr][k_dc] = '.';
                                    break;
								}
								k_dr += dr[4];
								k_dc += dc[4];
							}
						}
						break;
				}
			}
			
			
			System.out.print("#"+tc+" ");
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
		
	}


}
