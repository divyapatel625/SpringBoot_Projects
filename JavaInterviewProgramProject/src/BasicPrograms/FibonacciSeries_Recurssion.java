package BasicPrograms;

import java.util.Scanner;

/*
 * Fibonacci series
 * 
 * 0,1,1,2,3,5,...,n
 */
public class FibonacciSeries_Recurssion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int f1=0;
		int f2=1;
		int sum=0;

		while(sum<=n) {
			sum = f1+f2;
			System.out.print(f1+" ");
			f1=f2;
			f2=sum;
		}

		//System.out.println("Fibonaci series is "+sum);
	}
}
