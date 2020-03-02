package Test_7087;

import java.util.*;
public class Solution {
	static int T, N, ans;
	static int[] ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			ch = new int[91];
			ans = 0;
			for(int i=0;i<N;i++) {
				String s = sc.next();
				int tmp = (int)s.charAt(0);
				ch[tmp]++;
			}
			for(int i=65;i<=90;i++) {
				if(ch[i] == 0) {
					break;
				}else {
					ans++;
				}
			}
			System.out.println("#"+tc+" "+ans);
			
		}

	}

}
