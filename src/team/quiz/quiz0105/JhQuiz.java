package team.quiz.quiz0105;

public class JhQuiz {

	public static void main(String[] args) {
		
		int rabbit = 9;
		char cat = 'c';
		
		JhQuiz quiz = new JhQuiz();
		
		System.out.println("토끼와 고양이는 " + ((rabbit != cat)? quiz.falseMethod(): "같다"));
		
	}

	public String falseMethod() {
		return "같지 않다.";
	}
}

// 클래스명은 JhQuiz로 작성하시오.
// 토끼(rabbit)가 가지고 있는 값은 9이며, 고양이(cat)가 가지고 있는 값은 (소문자) c이다.
// 무조건 리턴값을 반환하는 메소드로 만드시오. 메소드명은 falseMethod이다.
// 단, 삼항연산자로 토끼와 고양이는 같지 않다는 조건으로 제시해야 한다.
// 시스템 출력코드 안에 한번에 작성하시오

