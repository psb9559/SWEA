package Test_2817;

import java.util.*;
public class Solution {
	static int T, N, K, cnt;
	static int[] arr;
	static int[] sel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			arr = new int[N];
			cnt = 0;
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=1;i<=N;i++) {
				sel = new int[i];
				dfs(0, 0);
			}
			System.out.println("#"+tc+" "+cnt);
		}

	}
	static void dfs(int idx, int s_idx) {
		if(s_idx == sel.length) {
			int sum = 0;
			for(int i=0;i<sel.length;i++) {
				sum += sel[i];
			}
			if(sum == K) {
				cnt++;
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
