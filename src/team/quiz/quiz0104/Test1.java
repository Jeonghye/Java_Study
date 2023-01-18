package team.quiz.quiz0104;

public class Test1 {

	public static void main(String[] args) {
		
		
		
		// -------------------------------------------------------------------------------------------------------------------------------------

	
//		a는 정수 20이고 b는 문자 ‘H’이다. a가 22와 60사이인지 판단하고 b가 대문자인지 소문자인지 판단하여라
//		(and, or연산자를 사용할 것)
//
//		-----답안예시 ---
//
//		a는 22~60사이가 아니다.
//		b는 대문자이다.

//		int a = 20;
//		char b = 'H';
//		
//		String resultA = (a > 22 && a < 60)? "a는 22~60사이가 맞다.": "a는 22~사이가 아니다.";
//		System.out.println(resultA);
//		String resultB = (b >= 'a' && a <= 'z')? "b는 소문자다.": "b는 대문자다.";
//		System.out.println(resultB);
		

		// -------------------------------------------------------------------------------------------------------------------------------------

		
//		한 집에 같이 살고 있는 강아지와 고양이가 있다. 
//		강아지 간식은 5개가 남았고 고양이 간식은 7개가 남았다. 
//		강아지와 고양이 모두 남은 간식이 3개 이하일 경우 주인이 간식을 새로 주문해준다. 
//
//		어느 날 강아지가 고양이의 간식을 4개 뺏어먹었다. 강아지와 고양이의 간식을 새로 주문해야 할지 구하시오.
//
//		Tip: 간식은 영어로 Treat 이라고 한다.
//
//		—— 답안 예시 ——
//		강아지 간식을 새로 주문해야 하나? false
//		고양이 간식을 새로 주문해야 하나? true
		
//		int dog = 5;
//		int cat = 7;
//		int treat = 3;
//		boolean dogTreat = (dog <= treat)? true: false;
//		boolean catTreat = ((cat - 4) <= treat)? true: false;
//		
//		System.out.println("강아지 간식을 새로 주문해야 하나? " + dogTreat);
//		System.out.println("고양이 간식을 새로 주문해야 하나? " + catTreat);
		
		// -------------------------------------------------------------------------------------------------------------------------------------

		
//		유재석은 오늘 시험을 보고
//		국어 점수는 96점, 영어 점수는 90점, 수학 점수는 92.5점을 맞고 A등급을 받았다.
//		 Method를 통해 이름, 각 점수와 등급을 나열하고 추가적으로 총점과 평균을 정수로 구하라
//
//		 ----- 답안 예시 -------
//
//		유재석은 국어 점수는 96점, 영어 점수는 90점, 수학 점수는 92.5점, 등급은 A입니다.
//		총점은 278이며, 평균은 92입니다.	
		
//		int kor = 96;
//		int eng = 90;
//		double math = 92.5;
//		char rank = 'a';
//		int sum1 = kor + eng + (int) math;
//		int avg1 = sum1 / 3;
//		
//		Test1 app1 = new Test1();
//		app1.methodSum(kor, eng, math, rank, sum1, avg1);
		
	}
	
//	public void methodSum(int kor, int eng, double math, char rank, int sum1, int avg1) {
//		System.out.println("유재석은 국어점수는 " + kor + "점, 영어점수는 " + eng + "점, 수학점수는 " + math + "점, 등급은 " + rank + "입니다.");
//		System.out.println("총점은 " + sum1 + "이며, 평균은 " + avg1 + "입니다.");
//	}

}
