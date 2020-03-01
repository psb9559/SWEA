package com.swex.algo;

import java.util.*;
public class Test_5948 {
	static int[] arr;
	static int[] sel;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			list = new ArrayList<>();
			arr = new int[7];
			sel = new int[3];
			for(int i=0;i<7;i++) {
				arr[i] = sc.nextInt();
			}
			dfs(0, 0);
			Collections.sort(list, new Comparator<Integer>() {

				@Override
				public int compare(Integer i1, Integer i2) {
					// TODO Auto-generated method stub
					if(i1 > i2) {
						return -1;
					}else{
						return 1;
					}
				}
				
			});
			for(int i=0;i<list.size();i++) {
				if(i == 4) {
					System.out.println("#"+tc+" "+list.get(i));
					break;
				}
			}
			
		}

	}
	static void dfs(int idx, int s_idx) {
		if(s_idx == sel.length) {
			int sum = 0;
			for(int i=0;i<sel.length;i++) {
				sum += sel[i];
			}
			if(!list.contains(sum)) {
				list.add(sum);
			}else {
				return;
			}
			return;
		}
		if(idx == arr.length) {
			return;
		}
		sel[s_idx] = arr[idx];
		dfs(idx+1, s_idx+1);
		dfs(idx+1, s_idx);	
	}

}
