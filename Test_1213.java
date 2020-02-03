package com.swex.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Test_1213 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("1213.txt"));
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int num = sc.nextInt();
			String target = sc.next();
			String test = sc.next();
			int result = 0;
			char[] arr = new char[target.length()];
			for(int i=0;i<arr.length;i++) {
				arr[i] = target.charAt(i);
			}
			
			for(int i=0;i<=test.length()-target.length();i++) {
				char[] tmp = new char[target.length()];
				int cnt = 0, m = 0;
				for(int j=i;j<i+target.length();j++) {
					tmp[m] = test.charAt(j);
					m++;
				}
				for(int k=0;k<target.length();k++) {
					if(arr[k] == tmp[k]) {
						cnt++;
					}
				}
				if(cnt == target.length()) {
					result++;
				}
			
			}
			System.out.println("#"+tc+" "+result);
			
		}

	}

}
