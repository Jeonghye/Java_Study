package code_review.practice.chap05_array.array.level04_advanced;

public class Test {

	public int randomMaker() {

		return (int) (Math.random() * 45) + 1;
	}
	
	
	
	public boolean overlapTest(int[] arr) {
		
		boolean match = false;
		for(int i = 0; i < 6; i++) {
			for(int j = i + 1; j < 6; j++) {
				if(arr[i] == arr[j]) {
					match = true; 
					break;
				}
			}
		}
		
		return match;
	}
	
	
	
	
	
	
	
	
	
	
}
