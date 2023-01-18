package team.quiz.quiz0104;

public class Quiz {

	public static void main(String[] args) {
		
		
		// 의도 논리연산자, 삼항연산자
		
		// a는 1.2이며 b는 22이고 ch1은 F이다.
		// a가 b보다 크면서 ch1가 대문자일 때 맞으면 a와 b를 더한 값을, 틀리면 b와 a의 뺀 값을 정수로 호출하시오.
		// 호출 예시
		// 정답은 : 23
		
		
		double a = 1.2;
		int b = 22;
		char ch1 = 'F';
		
		int result = (a < b && (ch1 >= 'A' && ch1 <= 'Z'))? (int)(a + b): (int)(b - a);
		System.out.println("정답은 : " + result);
		
//		double a = 1.2;
//		double b = 22.0;
//		char ch1 = 'F';
//		
//		int result = (a < b && (ch1 >= 'A' && ch1 <= 'Z'))? (int)(a + b): (int)(b - a);
//		System.out.println("정답은 : " + result);
		
		
	}

}
