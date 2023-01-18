package team.quiz.quiz0111;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		/*
		 * 10 이하의 정수 2개를 입력 받아 두 정수의 공배수를 전부 출력하는 프로그램을 만드세요.

			continue문을 이용해주세요.

			——출력 예시——
			10 이하의 정수 1개를 입력해주세요 : 3
			10 이하의 정수 1개를 입력해주세요 : 5
			15는 3과 5의 공배수이다.
			30는 3과 5의 공배수이다.
			45는 3과 5의 공배수이다.
			60는 3과 5의 공배수이다.
			75는 3과 5의 공배수이다.
			90는 3과 5의 공배수이다.
		 */

		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("10 이하의 정수 1개를 입력해주세요 : ");
		int num1 = sc.nextInt();

		System.out.print("10 이하의 정수 1개를 입력해주세요 : ");
		int num2 = sc.nextInt();

		for(int i = 1; i < 100; i++) {

			if((i % num1 == 0) && (i % num2 == 0)) {
				System.out.println(i + "는 " + num1 + "과 " + num2 + "의 공배수이다.");
				continue;
			}
		}
		 */

		/*
		다음 출력결과를 만드세요  
		break문 사용권장
		 "1부터 100까지의 합 조건 3,7의 배수는 제외 : “


		// 3과 7의 공배수일 때
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if((i % 3 == 0) && (i % 7 == 0)) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 합 조건 3,7의 배수는 제외 : " + sum);

		// 3의 배수와 7의 배수일 때
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if((i % 3 == 0) || (i % 7 == 0)) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 합 조건 3,7의 배수는 제외 : " + sum);
		 */

		/*
		학교에서 남학생과 여학생의 숫자를 조사하는데 남학생과 여학생의 숫자가
		같아야 하는데 다르다고 나오고 있다.

		남학생의 숫자를 man 여학생의 숫자를 girl이라고 했을 때
		남학생과 여학생에 각각 10~20중 하나의 난수를 생성하고

		남학생이 더 많이 나오면 “남학생이 더 많다. 다시 조사해보자”
		여학생이 더 많이 나오면 “여학생이 더 많다.다시 조사해보자”
		라고 출력된 뒤 적게 나온 쪽에 +1을하고 다시 비교한다.

		남학생과 여학생의 숫자가 같으면 “남학생과 여학생 수가 같다” 라고 출력되고 끝나도록 작성하시오.

		==== 출력 예시 ====

		여학생이 더 많다. 다시 조사해보자
		여학생이 더 많다. 다시 조사해보자
		남학생과 여학생 수가 같다.


		int man = (int)(Math.random() * 11) + 1; 
		int girl = (int)(Math.random() * 11) + 1;


		for(int i = 1; ; i++) {
			if (man < girl) {
				System.out.println("여학생이 더 많다. 다시 조사해보자");
				man++;
			} else if(girl < man) {
				System.out.println("남학생이 더 많다. 다시 조사해보자");
				girl++;
			} else {
				System.out.println("남학생과 여학생 수가 같다.");
				break;
			}
		}

		 */

		/*
		 * 2부터 9단까지의 구구단을 만든다.

		 ***조건***

		1. 1~10사이의 난수를 한가지 발생시켜 각 단의 수가 난수보다 큰 경우는 출력을 생략하며
		2. 난수가 1이거나 10일 경우 "난수를 다시 발생하세요." 라는 문자를 출력한다.

		3.변수명은 dan과 su로 지정

		====출력예제====

		난수를 다시 발생하세요.

		==============

		2 * 1 =2
		2 * 2 =4
		2 * 3 =6
		2 * 4 =8

		3 * 1 =3
		3 * 2 =6
		3 * 3 =9
		3 * 4 =12 

		...
		 */

		int num = 0;

		for(int i = 1; i <= 10; i++) {

			num = (int)(Math.random() * 10) + 1;
			if(num > 1 && num < 10) {
				break;
			} else {
				System.out.println("난수를 다시 발생하세요.");
			}
		}

		System.out.println("발생된 난수의 값 : " + num);

		for(int dan = 2; dan < 10; dan++) {
			for(int su = 1; su <= num; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			} 
			System.out.println();
		}
	}

}
