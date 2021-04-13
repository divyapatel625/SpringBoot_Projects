package BasicPrograms;

public class Infirmatica_PracticeProg1 {

	public static void main(String[] args) {

		int[] a = {1,2,3,2,3,1};

		for(int i=0; i<a.length; i++) {
			
			if(i==a.length-1) {
				System.out.print(1);
			} 
			else {
				int j=i+1;
				if(a[i]<a[j]) {
					System.out.print(a[j]);
					continue;
				}
				else {
					int max=a[j];
					while(j<a.length) {
						if(a[i]>=a[j]) {
							max=a[i];
							if(j==a.length-1)	System.out.print(1);
							j++;
						}
						else {
							max=a[j];
							System.out.print(a[j]);
							break;
						}
					}
				}
			}
		}

	}
}
