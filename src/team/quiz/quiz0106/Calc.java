package team.quiz.quiz0106;

public class Calc {

	public void calculator(int a) {
		if(a > 100) {
			System.out.println("1~100사이 정수를 입력하세요.");
		} else if(a % 2 != 0) {
			System.out.println("입력하신 수는 홀수입니다." + a);
		} else {
			System.out.println("입력하신 수는 짝수입니다." + a);
		}
	}
}
