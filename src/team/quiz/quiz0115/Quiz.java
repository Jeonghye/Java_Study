package team.quiz.quiz0115;

import java.util.Scanner;

public class Quiz {
	
	/*
	 * 변수 및 배열 생성명 = 입력(num), 배열(arr), 메소드명(randomMaker(int i))
	 * 스캐너를 통해 원하는 배열의 길이값을 입력받은 뒤
	 * 1 ~ 50까지의 난수를 발생시키는 static 메소드를 이용하여 
	 * 입력한 배열의 길이만큼 난수를 정수 배열 인덱스에 각각 대입하세요.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하시는 배열의 길이를 입력하시오 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = randomMaker();
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int randomMaker() {
		
		return (int) (Math.random() * 50) + 1;
	}

}
