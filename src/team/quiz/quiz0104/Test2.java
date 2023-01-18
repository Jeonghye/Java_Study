package team.quiz.quiz0104;

public class Test2 {

	public static void main(String[] args) {
		
		// -------------------------------------------------------------------------------------------------------------------------------------
//		1. 임의의 정수 변수 선언 후
//		2. 삼항다항식을 이용 임의변수가 1보다 크거나 같고 10보다 작으면 임의의 수를 출력 아니면 하위 메소드에 조건식에 해당하지 않는 인수를 넘겨주고 출력을 반환받으세요.
//		임의의수가 5이면 메인메소드에서 출력 아니먼 하위메소드에 20을 전달하고 반환받으세요
		
//		출력
//
//		num2는 5 //  num2 인자 5일때
//		5
//
//		num2는 20 // num2 인자 20일때
//		20
	
		
		int num1 = 15;
		Test2 app1 = new Test2();
		app1.methodNum1(num1);
		
		int i = app1.methodNum1(num1);
		
		int num2 = (num1 >= 1 && num1 < 10)? num1: app1.methodNum1(num1);
		
		System.out.println("num2는 " + num1);
		System.out.println(num2);
	}

	public int methodNum1(int num1) {
		return 20;
	}
}
