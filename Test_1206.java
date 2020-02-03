package com.swex.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Test_1206 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("1206.txt"));
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int size = sc.nextInt();
			int sum = 0;
			int[] map = new int[size];
			for(int i=0;i<size;i++) {
				map[i] = sc.nextInt();
			}
			for(int i=2;i<size-2;i++) {
				int cnt1 = 0, cnt2 = 0, result1 = 0, result2 = 0;
				int max1 = 0, max2 = 0;
				for(int j=i-1;j>=i-2;j--) {
					if(map[j] >= map[i]) {
						continue;
					}else {
						cnt1++;
					}	
				}
				if(cnt1 == 2) {
					for(int j=i-1;j>=i-2;j--) {
						if(map[j] >= max1) {
							max1 = map[j];
						}
					}
					result1 = map[i] - max1;
				}
				for(int j=i+1;j<=i+2;j++) {
					if(map[j] >= map[i]) {
						continue;
					}else {
						cnt2++;
					}
					
				}
				if(cnt2 == 2) {
					for(int j=i+1;j<=i+2;j++) {
						if(map[j] >= max2) {
							max2 = map[j];
						}
					}
					result2 = map[i] - max2;
				}
				if(result1 >= result2) {
					sum += result2;
				}else {
					sum += result1;
				}
				
			}
			System.out.println("#"+tc+" "+sum);
			
		}
		

	}

}
