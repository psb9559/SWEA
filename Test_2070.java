package algorithm_2020;

import java.util.*;
public class Test_2070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int i=1;i<=test_case;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a > b)
				System.out.println("#" + i + " >");
			else if(a < b)
				System.out.println("#" + i + " <");
			else
				System.out.println("#" + i + " =");
		}
		
		

	}

}
