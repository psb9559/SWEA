package com.swex.algo;

import java.util.*;
public class Test_3499 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			ArrayList<String> list = new ArrayList<>();
			ArrayList<String> list1 = new ArrayList<>();
			ArrayList<String> list2 = new ArrayList<>();
			for(int i=0;i<N;i++) {
				String s = sc.next();
				list.add(s);
			}
			if(N % 2 == 0) {
				for(int i=0;i<list.size();i++) {
					if(i < list.size()/2) {
						list1.add(list.get(i));
					}else {
						list2.add(list.get(i));
					}
				}

			}else {
				for(int i=0;i<list.size();i++) {
					if(i <= list.size()/2) {
						list1.add(list.get(i));
					}else {
						list2.add(list.get(i));
					}
				}
			}
			System.out.print("#"+tc+" ");
			for(int i=0;i<list2.size();i++) {
				System.out.print(list1.get(i) + " ");
				System.out.print(list2.get(i) + " ");
			}
			if(N % 2 != 0) {
				System.out.print(list1.get(list1.size()-1));
			}
			System.out.println();
			
			
		}

	}

}
