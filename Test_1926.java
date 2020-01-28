package com.swex.algo;

import java.util.*;
public class Test_1926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i>=1 && i<=29) {
				if((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9)
					System.out.print("- ");
				else
					System.out.print(i + " ");
			}else if(i>=30 && i<=299){
				
				
			}else if(i>=300 && i<=1000){
				
			}
		}

	}

}
