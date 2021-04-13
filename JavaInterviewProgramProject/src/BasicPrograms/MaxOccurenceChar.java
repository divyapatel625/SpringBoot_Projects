package BasicPrograms;

import java.util.HashMap;

public class MaxOccurenceChar {
	public static void main(String[] args) {

		String name = "DivyaPatel";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (char chars : name.toCharArray()) {
			if(!map.containsKey(chars)) {
				map.put(chars, 1);
				System.out.println(chars+" "+1);
			}
			else {
				int value=map.get(chars);
				value++;
				map.put(chars,value);	
				System.out.println(chars+" "+value);
			}
		}
		System.out.println("......................................");
		for (char chars : name.toCharArray()) {
			System.out.println(chars+" "+map.get(chars));
		}
		/*
		 * for (char chars : name.toCharArray()) { System.out.println(chars
		 * +" "+map.get(chars)); }
		 */
		
//		char[] chArr = name.toCharArray();
//		
//		for(int i=0; i<chArr.length-1 ;i++) {
//			 System.out.println(i);
//			if(map.get(chArr[i])>map.get(chArr[i+1])) {
//				//System.out.println("1");
//				System.out.println("Max Occurence of char is "+chArr[i]+" "+map.get(chArr[i]));
//				//System.out.println("3");
//				
//			}
//			
//		}
//		
//
	}
}
