package Test_4613;
import java.util.*;
public class Solution {
	static int T, N, M;
	static int[] W;
	static int[] B;
	static int[] R;
	static char[][] map;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			map = new char[N][M];
			W = new int[N];
			B = new int[N];
			R = new int[N];
			for(int i=0;i<N;i++) {
				String s = sc.next();
				for(int j=0;j<M;j++) {
					map[i][j] = s.charAt(j);
					if(map[i][j] == 'W') {
						W[i]++;
					}else if(map[i][j] == 'B') {
						B[i]++;
					}else {
						R[i]++;
					}
				}
			}
			int sum = 0;
			for(int i=1;i<=N-2;i++) {
				for(int j=i;j<N-1;j++) {
					int wcnt = 0;
					int bcnt = 0;
					int rcnt = 0;
					for(int k=0;k<i;k++) {
						wcnt += W[k];
					}
					for(int k=i;k<=j;k++) {
						bcnt += B[k];
					}
					for(int k=j+1;k<N;k++) {
						rcnt += R[k];
					}
					if(sum < wcnt + bcnt + rcnt) {
						sum = bcnt + wcnt + rcnt;
					}
					//sum = Math.max(sum, bcnt+wcnt+rcnt);
				}
			}
			sum = N*M - sum;
			System.out.println("#"+tc+" "+sum);
			
		}

	}

}
