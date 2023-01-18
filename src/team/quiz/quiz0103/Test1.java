package team.quiz.quiz0103;

public class Test1 {

	public static void main(String[] args) {
		
//		int a = 92;
//		int b = 100;
//		double c = 87.5;
//		double d = 90.2;
//		
//		double sum = a + b + c + d;
//		double avg = sum / 4;
//		
//		System.out.println("a의 점수 : " + sum + "점");
//		System.out.println("평균 점수 : " + avg + "점");
//		System.out.println("a와 평균의 차 : " + (float)(avg - a));
		
		
		/* 오늘 코딩시험이 있는 날이다.
		 * a는 92점, b는 100점, c는 87.5점, d는 90.2점을 받았다.
		 * a는 네 명의 평균보다 얼마나 점수를 잘 받았는지 궁금해한다.
		 * a와 평균의 차를 실수 형태로 출력해주세요.
		 * -- 출력 예시 --
		 * a의 점수 : 92점
		 * 평균 점수 : 92.425점
		 * a와 평균의 차 : 0.425점 
		 */
		
//		double a = 92;
//		double b = 100;
//		double c = 87.5;
//		double d = 90.2;
//				
//		double avg = (a + b + c + d)/4;
//		
//		
//		System.out.println("a의 점수 : " + (int)a + "점");
//		System.out.println("평균 점수 : " + avg + "점");
//		System.out.println("a와 평균의 차 : " + (float)(avg - a) + "점");
		
		float a = 92f;
		float b = 100f;
		float c = 87.5f;
		float d = 90.2f;
				
		float avg = (a + b + c + d)/4;
		
		
		System.out.println("a의 점수 : " + (int)a + "점");
		System.out.println("평균 점수 : " + avg + "점");
		System.out.println("a와 평균의 차 : " + (avg - a) + "점");

		
	}

}
