package com.swex.algo;

import java.util.*;
public class Test_8931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		int result = 0;
		for(int tc=1;tc<=test_case;tc++) {
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				int num = sc.nextInt();
				if(num != 0) {
					s.add(num);
					result += num;
				}else {
					int k = s.pop();
					result -= k;
				}
			}
			
			System.out.println("#"+tc+" "+result);
		}

	}

}
