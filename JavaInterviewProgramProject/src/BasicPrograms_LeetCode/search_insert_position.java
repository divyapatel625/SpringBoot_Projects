package BasicPrograms_LeetCode;

public class search_insert_position {

	public int searchInsert(int[] nums, int target) {
		int result = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]==target)
				return i;
		}
		for(int i=0; i<nums.length; i++){
			 if(target<nums[i])
	             return i;
			 
			if(i+1<nums.length && target>nums[i] && target<nums[i+1] )
				return i+1;
			if(i==nums.length-1)
				result = nums.length;
		} 
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		search_insert_position search_insert_position = new search_insert_position();
		System.out.print(search_insert_position.searchInsert(nums,2));
	}
}
