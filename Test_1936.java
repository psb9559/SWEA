package com.swex.algo;

import java.util.*;
public class Test_1936 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a == 1 && b == 3) ||(a == 2 && b == 1) || (a == 3 && b == 2)) {
			System.out.println("A");
		}else if((a == 3 && b == 1) ||(a == 1 && b == 2) || (a == 2 && b == 3)) {
			System.out.println("B");
		}
			
		

	}

}
