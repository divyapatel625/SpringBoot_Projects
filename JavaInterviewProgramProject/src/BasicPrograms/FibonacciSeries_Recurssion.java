package BasicPrograms;

import java.util.Scanner;

/*
 * Fibonacci series
 * 
 * 0,1,1,2,3,5,...,n
 */
public class FibonacciSeries_Recurssion {

	static int sum=0;
	static int n = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();

		recursion(0,1,n);

		//System.out.println("Fibonaci series is "+sum);
	}

	static void recursion(int f1,int f2, int n) {
		if(f1<=n) {
			sum = f1+f2;
			System.out.print(f1+" ");
			f1=f2;
			f2=sum;
		}
		else return;
		
		 recursion(f1,f2,n);
	}
}
