package code_review.practice.chap05_array.array.level04_advanced;

public class Application1 {

	public static void main(String[] args) {

		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */

		int[] arr = new int[6];

		Test test = new Test();

		//

		for(;;) {

			for(int i = 0; i < arr.length; i++) {
				arr[i] = test.randomMaker();
			}

			boolean overlap = test.overlapTest(arr);

			if(overlap) {
				continue;
			} else {
				for(int i = 0; i < arr.length; i++) {
					for(int j = i + 1; j < arr.length; j++) {
						if(arr[i] > arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
					System.out.print(arr[i] + " ");
				}
				break;
			}

		}

	}
}





