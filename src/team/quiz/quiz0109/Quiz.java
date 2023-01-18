package team.quiz.quiz0109;

public class Quiz {

	public static void main(String[] args) {
		
		// 학생 수가 24명인 한 반이 있다.
		// 짝수 번호만 한 줄로 나오도록 출력하세요.
		// 단, 반복문과 조건문, continue만 이용하세요.
		
		for(int i = 1; i < 25; i++) {
			if (!(i % 2 == 0)) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
