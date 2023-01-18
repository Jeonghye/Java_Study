package team.quiz.quiz0106;

import java.util.Scanner;

public class dong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("2번째 수 입력 : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("결과  : " + (num1 + num2));
		} else {
			System.out.println("결과  : " + (num1 - num2));
		}
	}
}
