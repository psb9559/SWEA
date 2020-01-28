package com.swex.algo;

import java.util.*;
public class Test_1948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=1;i<=tc;i++) {
			int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int f_month = sc.nextInt();
			int f_day = sc.nextInt();
			int l_month = sc.nextInt();
			int l_day = sc.nextInt();
			int result = 0;
			if(f_month == l_month) {
				result = l_day - f_day + 1;
				System.out.println("#" + i + " " + result);
			}else {
				for(int j=f_month-1;j<l_month;j++) {
					if(j == f_month-1)
						result += days[j] - f_day + 1;
					else if(j == l_month-1)
						result += l_day;
					else
						result += days[j];
				}
				System.out.println("#" + i + " " + result);
				
			}
		}

	}

}
