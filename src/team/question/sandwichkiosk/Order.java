package team.question.sandwichkiosk;

import java.util.Scanner;

public class Order {

	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * @return 선택 메뉴 구매 확정
	 */
	public boolean isChoose() {
		
		boolean order = false;
		
		System.out.print("주문하시겠습니까? (y/n) : ");
		String yn = sc.nextLine();
		
		if(yn.charAt(0) == 'y') {
			order = true;
		}
		
		return order;
	}
	
	/**
	 * @return 음료 구매 확정
	 */
	public boolean drinkOrder() {
		
		boolean order = false;
		System.out.print("음료 구매하시겠습니까? (y/n) : ");
		String yn = sc.nextLine();
		if(yn.charAt(0) == 'y') {
			order = true;
		}
		
		return order;
	}

	
	
	
}
