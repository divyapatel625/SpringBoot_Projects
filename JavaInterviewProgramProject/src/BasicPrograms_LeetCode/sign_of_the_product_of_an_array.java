package BasicPrograms_LeetCode;

import java.util.ArrayList;
import java.util.List;

class sign_of_the_product_of_an_array 
{
	static int neg_c = 0;

	public static void main(String[] args) {

		findTheWinner(6,5);
		//System.out.println();
	}

	public static void findTheWinner(int n, int k) {

		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			list.add(i+1);
			//System.out.print(i);
		}

		int j=1;
		int c=1;
		while(list.size()>1) {
			if(c==k) {
				System.out.print("Removed "+ list.get(j-1));
				list.remove(j-1);
				System.out.println(" List "+ list);
				c = 1;
			}
			j++;
			c++;
			if(j==n) {
				j=1;
			}
		}
		System.out.printf("Final winner "+list.get(0));
	}

}