package estd;

public class BigDiff {

	public int bigDiff(int[] nums) {
		  
		int maior=nums[0];
		int menor=nums[0];
		
		for (int i : nums) {
			
			if (i > maior){
				maior = i;
			}
			if (i < menor){
				menor = i;
			}
		}
		return maior - menor;
	}
}
