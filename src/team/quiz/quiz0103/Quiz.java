package team.quiz.quiz0103;

public class Quiz {

	public static void main(String[] args) {
		/*
		    어제 날짜는 20230102이고 오늘은 20220103이다. 
			어제 날짜와 오늘 날짜를 곱한 값을 출력해보자.

			출력 예시:
			어제 날짜 곱하기 오늘 날짜는 409257047160506이다.
		 */
		
		int yd1 = 20230102;
		int td1 = 20230103;
		long multi1 =(long) yd1 * td1;
		System.out.println("어제 날짜 * 오늘 날짜는 " + multi1 + "이다.");
		
		long yd2 = 20230102;
		long td2 = 20230103;
		long multi2 = yd2 * td2;
		System.out.println("어제 날짜 * 오늘 날짜는 " + multi2 + "이다.");
		
//		건물의 넓이는 10.82m, 길이는 14.82m, 높이는 20.345m
//		각각을 변수를 상수로 지정하고 건물의 크기를 정수로 구하세요
//		 -- 출력 예시 --
//		 건물 크기는 : 3262
		
		double width = 10.82;
		double leng = 14.82;
		double height = 20.345;
		double size = width * leng * height;
		int sizeInt = (int) size;
		System.out.println(sizeInt);
		
//		시험 결과 a는 70점, b는 89.5점, c는 91.3점, d는 59점이 나왔다
//		시험 결과의 총점과 평균 그리고 d와 평균 점수의 차이를 정수로 구하라
//
//		 --- 출력 예시 ---
//		총점 : 309
//		평균 : 77
//		d의 점수와 평균의 차이 : 18
		
		int a1 = 70;
		float b1 = 89.5f;
		float c1 = 91.3f;
		int d1 = 59;
		
		float sum = a1 + b1 + c1 + d1;
		int sumInt = (int) sum;
		int avg = sumInt / 4;
		
		System.out.println("총점 : " + sumInt);
		System.out.println("평균 : " + avg);
		System.out.println("d의 점수와 평균의 차이 : " + (avg - d1));
		
		
	}

}
