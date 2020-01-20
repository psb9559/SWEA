package algorithm_2020;

import java.util.Scanner;

public class Test_2072 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=1;i<=tc;i++) {
			int sum = 0, num = 0;
			for(int j=1;j<=10;j++) {
				num = sc.nextInt();
				if(num % 2 == 1)
					sum += num;
			}
			System.out.println("#" + i + " " + sum);
		}
		
	}
	
}
