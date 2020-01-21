package algorithm_2020;

import java.util.*;
public class Test_2071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int i=1;i<=test_case;i++) {
			int sum = 0, result = 0;
			double avg;
			for(int j=1;j<=10;j++) {
				int k = sc.nextInt();
				sum += k;
			}
			avg = (double)sum / 10;
			double kk = avg - (int)avg;
			if(kk >= 0.5) {
				result = (int)avg + 1;
				System.out.println("#" + i + " " + result);
			}else {
				result = (int)avg;
				System.out.println("#" + i + " " + result);
			}
		}
		

	}

}
