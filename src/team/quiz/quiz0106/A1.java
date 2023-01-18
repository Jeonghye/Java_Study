package team.quiz.quiz0106;

import java.util.Scanner;

public class A1 {
	
//	혈액형을 입력받고 그에 대응하는 혈액형별 성격을 출력하는 프로그램을 만들어주세요.
//
//	—혈액형별 성격 유형 샘플—
//	A: 당신은 완벽주의자입니다.
//	B: 당신은 자유로운 사람입니다.
//	O: 당신은 개그본능이 가득한 사람입니다.
//	AB: 당신은 4차원입니다.
//
//	——출력 예시——
//
//	당신의 혈액형은?
//	A
//	당신은 완벽주의자입니다.

	public static void main(String[] args) {
		
		int i = 1;
		while(i < 13) {
			System.out.println(i + "월의 시작입니다.");
			i++;
		}
		
		// -----------------------------------------------

		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 혈액형은? ");
		String blood = sc.nextLine();
		
		switch(blood) {
			case "A":
				System.out.println("당신은 완벽주의자입니다.");
				break;
				
			case "B":
				System.out.println("당신은 자유로운 사람입니다.");
				break;
				
			case "O":
				System.out.println("당신은 개그본능이 가득한 사람입니다.");
				break;
				
			case "AB":
				System.out.println("당신은 4차원입니다.");
				break;
		}
		
		
	}

}

//1월부터 12월까지 순차적으로 출력하고 한 해의 마무리까지 알려주는 간단한 출력 프로그램을 만들어주세요.
//
//——출력 예시——
//
//1월의 시작입니다.
//2월의 시작입니다.
//3월의 시작입니다.
//4월의 시작입니다.
//5월의 시작입니다.
//6월의 시작입니다.
//7월의 시작입니다.
//8월의 시작입니다.
//9월의 시작입니다.
//10월의 시작입니다.
//11월의 시작입니다.
//12월의 시작입니다.
//한 해를 마무리했습니다.
