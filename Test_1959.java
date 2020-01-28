package com.swex.algo;

import java.util.*;
public class Test_1959 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=1;i<=tc;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result_max = 0, size = 0;
			int[] test1 = new int[a];
			int[] test2 = new int[b];
			for(int j=0;j<a;j++)
				test1[j] = sc.nextInt();
			for(int j=0;j<b;j++)
				test2[j] = sc.nextInt();
			if(a > b) {
				size = b;
				int first = 0;
				while(true) {
					int sum = 0, k = 0;
					if(first > (a-b))
						break;
					for(int j=first;j<size;j++) {
						sum += test1[j] * test2[k];
						k++;
					}
					if(sum >= result_max)
						result_max = sum;
					first++;
					size++;					
				}					
				
			}else if(a <= b) {
				size = a;
				int first = 0;
				while(true) {
					int sum = 0, k = 0;
					if(first > (b-a))
						break;
					for(int j=first;j<size;j++) {
						sum += test1[k] * test2[j];
						k++;
					}
					if(sum >= result_max)
						result_max = sum;
					first++;
					size++;					
				}		
				
			}
			System.out.println("#" + i + " " + result_max);
			
			
		}
		

	}

}
