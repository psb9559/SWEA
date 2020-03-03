package Test_6485;

import java.util.*;
public class Solution {
	static int T, N, p, cnt;
	static int[] a, b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			a = new int[N+1];
			b = new int[N+1];
			for(int i=1;i<=N;i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
		
			p = sc.nextInt();
			System.out.print("#"+tc+" ");
			for(int i=1;i<=p;i++) {
				int c = sc.nextInt();
				cnt = 0;
				for(int j=1;j<=N;j++) {
					if(a[j] <= c && c <= b[j]) {
						cnt++;
					}
				}
				System.out.print(cnt + " ");
				
			}
			System.out.println();
		}

	}

}
