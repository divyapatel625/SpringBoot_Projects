package BasicPrograms;

import java.util.Scanner;


/**
 * Prime number are 3,5,7,11,13,17...
 * @author divya
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many prime numbers to print: ");
		int userinput = input.nextInt();

		if (userinput == 0)
			System.out.println("Enter integer > 0");
		else
		{
			int primeCount = 0;
			int num = 2 ;
			//boolean prime = false;
			while(true) 
			{
				boolean prime = false;
				for (int div = 2 ; div <=num/2; div++)
				{
					if (num % div == 0) 
					{
						prime = false;
						break;
					}
					else
						prime = true;
				}	

				if (prime == true || num == 2 || num == 3)
				{
					primeCount+=1;
					System.out.print(num);	
					if(userinput!=primeCount) 
						System.out.print(", ");
					else
						System.out.print("");

				}

				if (primeCount == userinput)
					break ;


				num = num + 1;
			}

		}
	}
}


