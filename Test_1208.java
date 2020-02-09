package com.swex.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Test_1208 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("1208.txt"));
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int cnt = sc.nextInt();
			int dif = 0;
			int[] map = new int[100];
			for(int i=0;i<map.length;i++) {
				map[i] = sc.nextInt();
			}
			Arrays.sort(map);
			for(int i=1;i<=cnt;i++) {
				map[99]--;
				map[0]++;
				Arrays.sort(map);
			}
			dif = map[99] - map[0];
			System.out.println("#"+tc+" "+dif);
			
		}
		

	}

}
