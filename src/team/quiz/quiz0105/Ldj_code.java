package team.quiz.quiz0105;

public class Ldj_code {
	
//	세가지 정수 20, 30, 40 이 있다.
//
//	큰 두 수를 먼저 더하고 작은 수를 뺀 값을 구하여라
//
//	- 변수명은 제시된 순서대로 first, second, third로 한다.
//
//	- 메소드를 이용할 것
//
//	-----결과 예시 ----
//
//	큰 두 수를 먼저 더하고 작은 수를 뺀 결과 : 50

	public static void main(String[] args) {
		
		int first = 20;
		int second = 30;
		int third = 40;
		
		methodA(first, second, third);
	}
	
	public static void methodA(int first, int second, int third) {

		System.out.println("큰 두 수를 먼저 더하고 작은 수를 뺀 결과 : " + (third + second - first));
	}

}
