package estd;

public class Even {

	public int countEvens(int[] nums) {
		int counter = 0;
		//Da frente para tras
		/*for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		De tras para frente
		for (int i = nums.length; i>= 0; i--) {
			System.out.println(nums[i]);
		}*/		
		for (int num : nums) {
			if (num % 2 == 0){
				counter++;
			}
		}
		return counter;
	}
	
}
