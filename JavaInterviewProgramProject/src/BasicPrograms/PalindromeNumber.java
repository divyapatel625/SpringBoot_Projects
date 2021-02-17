package BasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int PrimeNum = input.nextInt();
		int sum = 0;
		int tempNum = PrimeNum;
		
		while(tempNum>0) {
			int reminder = tempNum%10;
			sum = sum*10 + reminder;
			tempNum = tempNum/10;
		}
		
		if(sum == PrimeNum) {
			System.out.println("The given number "+ PrimeNum +" is palindrome");
		}
	}
}
