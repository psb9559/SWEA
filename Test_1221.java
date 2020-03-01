package com.swex.algo;

import java.util.*;

public class Test_1221 {
	static int T, N;
	static String test_case;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			test_case = sc.next();
			N = sc.nextInt();
			String[] arr = new String[N];
			for(int i=0;i<N;i++) {
				arr[i] = sc.next();
			}
			int[] res = new int[N];
			String[] number = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals(number[0])) {
					res[i] = 0;
				}else if(arr[i].equals(number[0])) {
					res[i] = 1;
				}else if(arr[i].equals(number[1])) {
					res[i] = 2;
				}else if(arr[i].equals(number[2])) {
					res[i] = 3;
				}else if(arr[i].equals(number[3])) {
					res[i] = 4;
				}else if(arr[i].equals(number[4])) {
					res[i] = 5;
				}else if(arr[i].equals(number[5])) {
					res[i] = 6;
				}else if(arr[i].equals(number[6])) {
					res[i] = 7;
				}else if(arr[i].equals(number[7])) {
					res[i] = 8;
				}else if(arr[i].equals(number[8])) {
					res[i] = 9;
				}
			}
			Arrays.sort(res);
			for(int i=0;i<res.length;i++) {
				if(res[i] == 0) {
					arr[i] = number[0];
				}else if(res[i] == 1) {
					arr[i] = number[1];
				}else if(res[i] == 2) {
					arr[i] = number[2];
				}else if(res[i] == 3) {
					arr[i] = number[3];
				}else if(res[i] == 4) {
					arr[i] = number[4];
				}else if(res[i] == 5) {
					arr[i] = number[5];
				}else if(res[i] == 6) {
					arr[i] = number[6];
				}else if(res[i] == 7) {
					arr[i] = number[7];
				}else if(res[i] == 8) {
					arr[i] = number[8];
				}else if(res[i] == 9) {
					arr[i] = number[9];
				}
			}
			
			System.out.println("#"+tc);
			for(String s : arr) {
				System.out.print(s + " ");
			}
			System.out.println();
		}

	}

}
