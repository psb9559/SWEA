package com.swex.algo;

import java.util.*;
public class Test_1288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for(int i=1;i<=tc;i++) {
			int num = sc.nextInt();
			int[] visit = {0,0,0,0,0,0,0,0,0,0};
			int result = 1;
			boolean flag = false;	
			while(true) {
				int tmp = num * result;
				while(tmp > 0) {
					visit[tmp % 10]++;
					tmp /= 10;
				}
				for(int j=0;j<10;j++) {
					if(visit[j] == 0) {
						flag = false;
						break;
					}else {
						flag = true;
					}
					
				}
				if(flag)
					break;
				result++;
			}
			System.out.println("#" + i + " " + num * result);
		}
		

	}

}
