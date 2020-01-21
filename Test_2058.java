package algorithm_2020;

import java.util.*;
public class Test_2058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(true)
        {
            int tmp = n % 10;
            if(n == 0)
                break;
            sum += tmp;
            n = n / 10;
        }
        System.out.println(sum);

	}

}
