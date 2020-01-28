package com.swex.algo;

import java.util.*;
public class Test_1979 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int cnt = 0;
			int[][] map = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0;i<n;i++) {
				int j=0;
				int r_cnt = 0;
				while(true) {
					if(map[i][j] != 1) {
						if(r_cnt == k)
							cnt++;
						r_cnt = 0;
						j++;
					}
					else {
						r_cnt++;
						j++;
					}
					if(j == n) {
						if(r_cnt == k)
							cnt++;
						break;
					}
				}
			}
			for(int i=0;i<n;i++) {
				int j=0;
				int c_cnt = 0;
				while(true) {
					if(map[j][i] != 1) {
						if(c_cnt == k)
							cnt++;
						c_cnt = 0;
						j++;
					}
					else {
						c_cnt++;
						j++;
					}
					if(j == n) {
						if(c_cnt == k)
							cnt++;
						break;
					}
				}
				
			}
			
			System.out.println("#" + tc + " " + cnt);
		}

	}

}
