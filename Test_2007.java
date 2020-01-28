package com.swex.algo;

import java.util.*;
public class Test_2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=1;i<=tc;i++) {
			String s = sc.next();
			int k = 0;
			int size = s.length();
			for(int j=1;j<size;j++) {
				if(s.charAt(j) == s.charAt(k)) {
					k++;
				}else {
					k = 0;
				}
			}
			System.out.println("#" + i + " " + (size-k));
			
		}

	}

}
