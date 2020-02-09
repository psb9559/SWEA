package com.swex.algo;

import java.util.*;
public class Test_5162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a > b) {
				System.out.println("#"+tc+" "+c/b);
			}else {
				System.out.println("#"+tc+" "+c/a);
			}
			
		}

	}

}
