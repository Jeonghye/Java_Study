package team.quiz.quiz0105;

public class Yjh_code {
	
//	[원하는 범위의 난수 생성, 상항연산자]
//	-100부터 100사이의 정수를 구하는 난수를 생성하고
//	난수가 음수인지 양수인지 0인지 구하는 상항연산자를 작성하시오.
//	난수 변수명 = randomy
//	상항 연산자 = resulty
//
//	밑 출력 예시 중 하나만 나오면 됩니다.
//
//	——————- 출력 예시 ——————
//	39은 양수입니다.
//	——————————-
//	-85은 음수입니다.
//	——————————
//	0입니다.

	public static void main(String[] args) {
		
		int randomy = (int) (Math.random() * 201 - 100);
		
		String resulty = (randomy > 0)? "은 양수입니다.": (randomy < 0)? "은 음수입니다.": "입니다.";
		
		System.out.println(randomy + resulty);
		
	}

}
