package com.swex.algo;

import java.util.*;
public class Test_6692 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			int n = sc.nextInt();
			double[] fl = new double[n];
			int[] in = new int[n];
			double sum = 0.0;
			for(int i=0;i<n;i++) {
				fl[i] = sc.nextDouble();
				in[i] = sc.nextInt();
				sum += fl[i]*in[i];
			}
			
			System.out.println("#"+tc+" "+sum);
		}

	}

}
