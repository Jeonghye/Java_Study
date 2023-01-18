package team.quiz.quiz0106;

public class Quiz {

	public static void main(String[] args) {

		// 반복문을 이용하여 각각 보리와 쌀 단어만을 가지고
		// 보리보리쌀이 나오게 세줄 반복하세요
		// 단, 출력값 "보리보리쌀" 이렇게 넣으면 안됨. 보리와 쌀은 개별 출력값입니다.

		// 


		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 2; j++) {
				System.out.print("보리");
			} 
			System.out.println("쌀");
		}


		// 반복문과 메소드
		// 랜덤한 수 1 ~ 100이 나오는 메소드를 만든 후
		// 총 10번 나오도록 호출하세요.


		for(int i = 0; i < 10; i++) {
			RandomStart();
		}


	}

	public static void RandomStart() {
		int random = (int) (Math.random() * 100 + 1);
		System.out.println(random);
	}

}
