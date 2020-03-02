package Test_4047;

import java.util.*;


public class Solution {
	static int s_cnt, d_cnt, h_cnt, c_cnt;
	static int[] s_arr;
	static int[] d_arr;
	static int[] h_arr;
	static int[] c_arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			s_cnt = 13;
			d_cnt = 13;
			h_cnt = 13;
			c_cnt = 13;
			s_arr = new int[14];
			d_arr = new int[14];
			h_arr = new int[14];
			c_arr = new int[14];
			String s = sc.next();
			boolean flag = true;

			for(int i=0;i<=s.length()-3;i+=3) {
				String tmp = s.substring(i, i+3);
				char shape = tmp.charAt(0);
				int num = Integer.parseInt(tmp.substring(1, 3));
				switch(shape) {
					case 'S':
						if(s_arr[num] == 1) {
							flag = false;
							break;
						}
						s_arr[num]++;
						s_cnt--;
						break;
					case 'D':
						if(d_arr[num] == 1) {
							flag = false;
							break;
						}
						d_arr[num]++;
						d_cnt--;
						break;
					case 'H':
						if(h_arr[num] == 1) {
							flag = false;
							break;
						}
						h_arr[num]++;
						h_cnt--;
						break;
					case 'C':
						if(c_arr[num] == 1) {
							flag = false;
							break;
						}
						c_arr[num]++;
						c_cnt--;
						break;			
				}
			}
			System.out.print("#"+tc+" ");
			if(flag) {
				System.out.println(s_cnt + " " + d_cnt + " " + h_cnt + " " + c_cnt);
			}else {
				System.out.println("ERROR");
			}
			
		}

	}

}
