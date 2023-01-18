package team.quiz.quiz0115;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {

		/**
		 * 문제1
		 * 
		 * [DTO 만들기 연습, non-static 메소드 호출, 객체를 인자로 전달하기] 
		 * (5~7분, 타자 느릴 경우 최대 10분)
		 * 
		 * 1. 이름이 PersonDTO 인 클래스를 생성하여 필드로 이름, 나이, 성별, 키를 할당한 후 모든 필드 변수를 매개변수로 받는 생성자를 만든다. 
		 * 2. 실행용 클래스를 따로 생성한다. 메인 메소드 내부에서 1에서 만든 생성자를 호출해 
		 * 		이름: 홍길동
		 * 		나이: 20
		 * 		성별: 남
		 * 		키: 181.5
		 * 		의 정보를 갖는 객체 person을 만든다.
		 * 3. 실행용 클래스에서 person의 사람이 대한민국에서 합법적으로 술을 살 수 있는지 출력하는 메소드를 만든다. (메인 메소드에서 호출한다.) 

		 * getter, setter 만들기 연습 원하시면 다 적으셔도 됩니다. 제 정답에선 getter 2개만 이용했습니다.
		 * 
		 * ——출력 예시——
		 * 홍길동은 합법적으로 술을 구매할 수 있습니다.
		 * (정답에 DTO는 올리지 않는 걸로 해요…!! 그건 심플하니까… 그렇지만 만약 어딘가 문제가 있었다면 주석처리하여 적어주세요) 
		 */

		//		Scanner sc = new Scanner(System.in);
		//
		//		System.out.print("이름 : ");
		//		String name = sc.nextLine();
		//
		//		System.out.print("나이 : ");
		//		int age = sc.nextInt();
		//
		//		System.out.print("성별 : ");
		//		char gender = sc.next().charAt(0);
		//
		//		System.out.print("키 : ");
		//		double height = sc.nextDouble();
		//
		//		PersonDTO person = new PersonDTO(name, age, gender, height);
		//		person.getAge();
		//		person.getName();
		//		person.print();

		/**
		 * 문제2
		 * 
		 * 과일 4개와 가격을 입력받고
		 * 배열을 선언하고 할당한 후 조건문을 사용하여 저장 및 각 과일의 이름과 가격을 출력하세요.
		 * 입력 예) 
		 * 1번째 과일을 입력하세요 : 사과
		 * 1번째 과일 가격을 입력하세요 : 100
		 * 
		 * 4개입력
		 * 
		 * 출력 예)
		 * 
		 * 1번째 과일은 사과, 가격은 100 입니다.
		 * 2번째 과일은 귤, 가격은 200 입니다.
		 * 3번째 과일은 포도, 가격은 250 입니다.
		 * 4번째 과일은 바나나, 가격은 400 입니다.
		 * */

		//		Scanner sc = new Scanner(System.in);
		//		String[] fruitArr = new String[4];
		//		int[] priceArr = new int[4];
		//		
		//		String fruit;
		//		int price;
		//		for(int i = 0; i < 4; i++) {
		//			
		//			System.out.println((i + 1) + "번째 과일을 입력하세요 : ");
		//			fruit = sc.nextLine();
		//			fruitArr[i] = fruit;
		//			System.out.println((i + 1) + "번째 과일의 가격을 입력하세요 : ");
		//			price = sc.nextInt();
		//			sc.nextLine();
		//			priceArr[i] = price;
		//		}
		//		
		//		for(int i = 0; i < 4; i++) {
		//			System.out.println((i + 1) + "번째 과일은 " + fruitArr[i] + ", 가격은 " + priceArr[i] + "원 입니다.");
		//		}

		/**
		 *  짜장면 짬뽕 탕수육 중에 오늘 어떤 반반 메뉴를 먹을지 고르는 문제이다.
		 *  메뉴는 랜덤으로 골라지며, 배열을 통하여 메뉴를 생성한다.
		 *  만일 골라진 두개의 메뉴가 같으면 “아쉽지만 오늘은 00만 먹어야겠네” 라고 출력하고 
		 *  만일 다른 두 메뉴를 고르면 “오늘은 oo xx 메뉴 반반을 먹자!”라고 출력한다.
		 *  
		 *  ===출력 예제===
		 *  오늘은 짬뽕 탕수육 반반을 먹자!
		 *  
		 *  ========
		 *  아쉽지만 오늘은 탕수육만 먹어야겠네
		 * */

		//		String[] menu = new String[] {"짜장면", "짬뽕", "탕수육"};
		//		
		//		int num = (int) (Math.random() * 3);
		//		String a = menu[num];
		//		
		//		num = (int) (Math.random() * 3);
		//		String b = menu[num];
		//		
		//		if ( a != b ) {
		//			System.out.println("오늘은 " + a + " " + b + " 메뉴 반반을 먹자!");
		//		} else {
		//			System.out.println("아쉽지만 오늘은 " + a + "만 먹어야겠다!");
		//		}

		/**
		 * 배열을 사용하여 구구단 2단을 만들어 출력하기
		 * 배열을 사용하여 구구단 2단을 만들어 출력하라 
		 * 단, 배열은 2개를 만들어서 사용할것
		 * */

		//		int[] su = new int[9];
		//		int[] result = new int[9];
		//		
		//		System.out.println("=========== 구구단 2단 ===========");
		//		
		//		for(int i = 0; i < su.length; i++) {
		//			su[i] = i + 1;
		//			result[i] = 2 * (i + 1);
		//			System.out.println("2 * " + su[i] + " = " + result[i]);
		//		}

	}
}

