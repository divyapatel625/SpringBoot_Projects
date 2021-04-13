package BasicPrograms;

public class DemoWithFloworx {
	public static void main(String[] args) {
		int[] arr = {3,4,6,8,9,1};
		int[] arr1 = new int[arr.length-1];
		int count =0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%2==0) {
				arr1[count] = arr[i];
				count++;
			} 
		}
		for(int i=0; i<arr.length-1;i++) {
			boolean flag = false;
			for(int j=0; j<arr1.length-1; j++) {
				if(arr1[j]==arr[i])
					break;
				else {
					flag = true;
					break;
				}
			}
			if(flag) {
				arr1[count] = arr[i];	
				count++;
			}
		}
		for(int k: arr1) {
			System.out.println(arr1[k]);
		}
	}
}