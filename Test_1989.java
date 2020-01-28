package com.swex.algo;

import java.util.*;
public class Test_1989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=1;i<=tc;i++) {
			String s = sc.next();
			int cnt = 0;
			char[] test1 = new char[s.length()];
			char[] test2 = new char[s.length()];
			for(int j=0;j<s.length();j++) {
				test1[j] = s.charAt(j);
				test2[s.length()-1-j] = test1[j];
			}
			for(int j=0;j<test1.length;j++) {
				if(test1[j] == test2[j]) {
					cnt++;
				}else {
					continue;
				}
			}
			if(cnt == test1.length)
				System.out.println("#" + i + " 1");
			else
				System.out.println("#" + i + " 0");
			
		}

	}

}
