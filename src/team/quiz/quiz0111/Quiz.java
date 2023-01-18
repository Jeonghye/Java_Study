package team.quiz.quiz0111;

public class Quiz {

	public static void main(String[] args) {

		char[] arr = new char[] {'D', 'B', 'C', 'E', 'A'};
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j <= i; j++) {
				if(arr[i] < arr[j]) {
					char temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr);
	}

	// 배열명 arr이라는 문자형 배열에 순서대로 D, B, C, E, A가 있다. 순차 정렬 하시오.

}
