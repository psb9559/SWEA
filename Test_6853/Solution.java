package Test_6853;

import java.util.*;
public class Solution {
	static int T, N, ans;
	static int x1, y1, x2, y2;
	static int cnt1, cnt2, cnt3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			N = sc.nextInt();
			cnt1 = 0;
			cnt2 = 0;
			cnt3 = 0;
			for(int i=0;i<N;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				if(x < x1 || x > x2 || y < y1 || y > y2) {
					cnt3++;
				}else if(x >= x1 && x <= x2 && y >= y1 && y <= y2) {
					if((x != x1 && x != x2) && (y != y1 && y != y2)) {
						cnt1++;
					}else {
						cnt2++;
					}
				}
			}
			System.out.println("#"+tc+" "+cnt1+" "+cnt2+" "+cnt3);
		}

	}

}
