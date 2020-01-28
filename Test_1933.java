package com.swex.algo;

import java.util.*;
public class Test_1933 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] result = new int[n];
		for(int i=0;i<n;i++) {
			if(n % (i+1) == 0) {
				result[i] = i+1;
				System.out.print(result[i] + " ");
			}
		}

		

	}

}
