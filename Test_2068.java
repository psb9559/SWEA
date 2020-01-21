package algorithm_2020;

import java.util.Scanner;

public class Test_2068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int i = 1; i <= test_case; i++)
        {
            int[] arr = new int[10];
            int max = 0;
            for(int j=0;j<10;j++) {
                arr[j] = sc.nextInt();
                if(arr[j] > max)
                    max = arr[j];           
            }
            System.out.println("#" + i + " " + max);
         
 
 
        }

	}

}
