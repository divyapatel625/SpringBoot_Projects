package BasicPrograms;

import java.util.Scanner;

public class fibonacci_WithoutRec {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int f1=0;
	int f2=1;
	int sum=0;
	int count = 0;

	while(count<n) {
		sum = f1+f2;
		System.out.print(f1+" ");
		f1=f2;
		f2=sum;
		count++;
	}

	//System.out.println("Fibonaci series is "+sum);

}
}
