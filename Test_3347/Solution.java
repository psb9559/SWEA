package Test_3347;
import java.util.*;
public class Solution {
	static int T, N, M, ans;
	static int[] A;
	static int[] B;
	static int[] score;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			A = new int[N+1];
			B = new int[M+1];
			score = new int[N+1];
			ans = 0;
			for(int i=1;i<=N;i++) {
				A[i] = sc.nextInt();
			}
			for(int i=1;i<=M;i++) {
				B[i] = sc.nextInt();
			}
			for(int i=1;i<=M;i++) {
				list = new ArrayList<>();
				for(int j=1;j<=N;j++) {
					if(B[i] >= A[j]) {
						list.add(j);
					}
				}
				Collections.sort(list);
				score[list.get(0)]++;
			}
			int max = 0;
			for(int i=1;i<=N;i++) {
				if(max < score[i]) {
					max = score[i];
					ans = i;
				}
			}
			System.out.println("#"+tc+" "+ans);
		}
	}

}
