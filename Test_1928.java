package com.swex.algo;

import java.util.*;
public class Test_1928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=1;i<=tc;i++) {
			int num = sc.nextInt();
			int sum = 1;
			for(int j=2;j<=num;j++) {
				if(j % 2 == 0) {
					sum = sum - j;
				}else if(j % 2 == 1) {
					sum = sum + j;
				}
			}
			System.out.println("#" + i + " " + sum);
		}
		

	}

}
