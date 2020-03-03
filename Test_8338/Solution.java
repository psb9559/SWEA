package Test_8338;

import java.util.*;
public class Solution {
	static int T, N, ans;
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			
			arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			ans = arr[0];
			for(int i=1;i<=N-1;i++) {
				if(ans+arr[i] >= ans*arr[i]) {
					ans += arr[i];
				}else {
					ans *= arr[i];
				}
			}
			System.out.println("#"+tc+" "+ans);
		}
	}

}
