package Test_9229;

import java.util.*;
public class Solution {
	static int T, N, M, ans;
	static int[] arr;
	static int[] sel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			arr = new int[N];
			sel = new int[2];
			ans = 0;
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			dfs(0, 0);
			if(ans == 0) {
				System.out.println("#"+tc+" -1");
			}else {
				System.out.println("#"+tc+" "+ans);
			}
		}

	}
	static void dfs(int idx, int s_idx) {
		if(s_idx == sel.length) {
			int sum = 0;
			for(int i=0;i<sel.length;i++) {
				sum += sel[i];
			}
			if(sum <= M) {
				ans = Math.max(ans, sum);
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
