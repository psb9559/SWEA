package Test_8457;

import java.util.*;
public class Solution {
	static int T, N, B, E, ans;
	static int[] watch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			B = sc.nextInt();
			E = sc.nextInt();
			ans = 0;
			watch = new int[N];
			for(int i=0;i<N;i++) {
				watch[i] = sc.nextInt();
				for(int j=B-E;j<=B+E;j++) {
					if(j % watch[i] == 0) {
						ans++;
						break;
					}
				}
			}
			
			System.out.println("#"+tc+" "+ans);
			
		}

	}

}
