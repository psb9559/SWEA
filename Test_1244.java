package com.swex.algo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Test_1244 {
	static String[] str;
	static String num;
	static int[] arr;
	static int limit, ans;
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Money.txt"));
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			num = sc.next();
			limit = sc.nextInt();
			ans = Integer.parseInt(num);
			arr = new int[num.length()];
			for(int i=0;i<arr.length;i++) {
				arr[i] = Integer.parseInt(num.substring(i, i+1));
			}
			perm(0, 0);	
			System.out.println("#"+tc+" "+ans);
			
		}

	}
	static void perm(int idx, int cnt) {
		if(cnt == limit) {
			String strr = "";
			for(int i=0;i<arr.length;i++) {
				 strr += Integer.toString(arr[i]);
			}
			//System.out.println(strr);
			if(Integer.parseInt(strr) > ans) {
				ans = Integer.parseInt(strr);
			}

			return;
		}


		for(int i=idx;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] <= arr[j]) {
					swap(i, j);
					perm(i, cnt+1);
					swap(i, j);
				}
			}
		}
				
	}
	static void swap(int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
