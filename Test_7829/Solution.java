package Test_7829;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int p = sc.nextInt();
			int[] arr = new int[p];
			for(int i=0;i<p;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int min = arr[0];
			int max = arr[arr.length-1];
			System.out.println("#"+tc+" "+(min*max));
		}

	}

}
