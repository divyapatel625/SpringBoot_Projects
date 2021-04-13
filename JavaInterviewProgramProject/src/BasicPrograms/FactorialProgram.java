package BasicPrograms;

import java.util.Scanner;

public class FactorialProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number for which you would like to find the factial number: ");

		long factNum = input.nextInt();
		int result = 1;
		
		System.out.print("1*");
		
		for(int i=2; i<= factNum; i++){
			result = result*(i);
			if(i!=factNum) {
				System.out.print(i+"*");
			}else 
				System.out.print(i);
		}
		
		System.out.print(" = "+ result);
	}
}
