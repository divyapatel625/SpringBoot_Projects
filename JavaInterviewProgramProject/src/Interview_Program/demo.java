package Interview_Program;

public class demo {

	public static void main(String[] args) {
		int[] a = {3,4,1,1,2};
		
		int[] b = new int[5];
		for(int i=0; i<a.length; i++) {
			
			int j=0;
			int count = 0;
			
			while(a[i]<a[j] && j<a.length) {
				count++;
				j++;
			}
			
			b[i] = count;
			System.out.println(count);
		}
		for (int i : b) {
			System.out.println("B array "+i);
		}
	
	}
}
