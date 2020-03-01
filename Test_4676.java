package com.swex.algo;

import java.util.*;
public class Test_4676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			String tmp = sc.next();
			ArrayList<Character> list = new ArrayList<>();
			for(int i=0;i<tmp.length();i++) {
				list.add(tmp.charAt(i));
			}
			int cnt = sc.nextInt();
			int[] arr = new int[cnt];
			for(int i=0;i<cnt;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			System.out.print("#"+tc+" ");
			for(int j=cnt-1;j>=0;j--) {
				list.add(arr[j], '-');
			}
			for(char ch : list) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
