package team.quiz.quiz0106;

public class A3 {

	public static void main(String[] args) {
		
//		60~100사이의 무작위 난수로 점수를 생성하고
//
//		~70 까지 D
//
//		71 ~ 80 까지 C
//
//		81 ~ 90 까지 B
//
//		91 ~ 100 까지 A 등급이다.
//
//		A등급이 나올 때까지 점수에 10점씩 더하면서 
//		점수와 등급을 출력하는 for문을 작성하시오.
//
//		———-출력 예시—--
//
//		이번 시험 성적은 75점으로 등급은 C입니다.
//		이번 시험 성적은 85점으로 등급은 B입니다.
//		A등급 축하드립니다~!

		// 65 66 67 68
		int score = (int)(Math.random() * 41) + 60;
		
		System.out.println(score);
		
		
		for(int i = score; i <= 100; i += 10) {
			System.out.println("이번 시험 성적은 " + i + "점으로 D입니다.");
			
		}

	}

}
