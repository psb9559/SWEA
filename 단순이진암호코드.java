package com.swex.algo;

import java.util.*;
public class 단순이진암호코드 {
	static int N, M;
	static int[][] map;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String[] s = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001","0101111", "0111011", "0110111", "0001011"}; 
	        int test_case = sc.nextInt();
	        for(int tc=1;tc<=test_case;tc++) {
	            int ans = 0;
	            N = sc.nextInt();
	            M = sc.nextInt();
	            map = new int[N][M];
	            for(int i=0;i<N;i++) {
	                String str = sc.next();
	                for(int j=0;j<str.length();j++) {
	                    int num = Integer.parseInt(str.substring(j, j+1));
	                    map[i][j] = num;                    
	                }
	            }
	            String tmp = "";
	            label : for(int i=0;i<N;i++) {
	                    for(int j=M-1;j>=0;j--) {
	                    if(map[i][j] == 0) {
	                        continue;
	                    }else if(map[i][j] == 1) {
	                        for(int k=j-55;k<=j;k++) {
	                            tmp += Integer.toBinaryString(map[i][k]);
	                        }
	                        break label;
	                    }
	                }
	            }
	            String[] tmp2 = new String[8];
	            int k = 0;
	            for(int i=0;i<tmp.length();i+=7) {               
	                tmp2[k] = tmp.substring(i, i+7);
	                k++;
	            }
	 
	            int sum1 = 0, sum2 = 0; 
	            for(int i=0;i<tmp2.length;i++) {
	                for(int j=0;j<10;j++) {
	                    if(tmp2[i].equals(s[j])) {
	                        tmp2[i] = Integer.toString(j);
	                        break;
	                    }
	                }
	            }
	 
	            for(int i=0;i<tmp2.length;i++) {
	                if((i+1) % 2 != 0) {
	                    sum1 += Integer.parseInt(tmp2[i]);
	                }else {
	                    sum2 += Integer.parseInt(tmp2[i]);
	                }
	            }
	 
	            int result = (sum1*3)+sum2;
	            if(result % 10 == 0) {
	                for(int i=0;i<tmp2.length;i++) {
	                    ans += Integer.parseInt(tmp2[i]);
	                }
	            }else {
	                ans = 0;
	            }
	 
	            System.out.println("#"+tc+" "+ans);
	        }
	 

	}

}
