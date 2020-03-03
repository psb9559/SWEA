package Test_1219;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Solution {
	static int T, N, ans;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			T = sc.nextInt();
			N = sc.nextInt();
			ans = 0;
			list = new ArrayList[100];
			for(int i=0;i<100;i++) {
				list[i] = new ArrayList<>();
			}
			for(int i=1;i<=N;i++) {
				int a = sc.nextInt();
				int b =sc.nextInt();
				list[a].add(b);
			}
			dfs(0);
			System.out.println("#"+tc+" "+ans);
			
		}
		

	}
	static void dfs(int v) {
		if(v == 99) {
			ans = 1;
			return;
		}
		for(int i=0;i<list[v].size();i++) {
			if(list[v].get(i) != 0) {
				dfs(list[v].get(i));
			}
		}
		
	}

}
