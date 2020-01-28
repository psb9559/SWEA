package com.swex.algo;

import java.util.*;
public class Test_2056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int i=1;i<=test_case;i++) {
			String s = sc.next();
			int year = Integer.valueOf(s.substring(0, 4));
			int month = Integer.valueOf(s.substring(4, 6));
			int day = Integer.valueOf(s.substring(6, 8));
			
			String res = "-1";
			if(month >= 1 && month <= 12 && day >= 1 && day <= daysOfMonth[month-1])
				res = String.format("%s/%s/%s", s.substring(0, 4), s.substring(4, 6), s.substring(6, 8));
			 System.out.format("#%d %s\n", test_case, res);

		}
		
		
		

	}
}

