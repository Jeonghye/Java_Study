package team.quiz.quiz0105;

import java.util.Scanner;

public class Lbs_code {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 값을 입력하세요 : ");
		int r = sc.nextInt();
		
		System.out.println("원의 반지름은 " + r);
		
		Lbs_code all = new Lbs_code();
		all.circle(r);
		
	}
	
	public void circle(int r) {
		
		double a = Math.pow(r, 2) * Math.PI;
		
		System.out.println("원의 넓이는 : " + a);
	}

}
