package team.question.sandwichkiosk;

import java.util.Scanner;

public class Kiosk {

	private String selectSandwich;
	private String selectDrink;

	Scanner sc = new Scanner(System.in);

	Sandwich sandwich = new Sandwich();
	SandwichDTO[] sarr = sandwich.setSandwich();

	Drink drink = new Drink();
	String[] darr = drink.getDrink();

	Order order = new Order();

	public void showKiosk() {

		while(true) {

			System.out.println("================================");
			System.out.println("1. 샌드위치 메뉴");
			System.out.println("2. 음료 메뉴");
			System.out.println("3. 주문 목록 확인");
			System.out.println("9. 결제");
			System.out.println("================================");
			System.out.print("메뉴를 선택하세요 : ");
			int choose = sc.nextInt();

			switch(choose) {
			case 1 : sandwichMenu(); break;
			case 2 : drinkMenu(); break;
			case 3 : showOrder(); break;
			case 9 : System.out.println("결제가 완료되었습니다. 감사합니다."); return;
			default : System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}

	public void sandwichMenu() {

		while(true) {
			System.out.println("========== 샌드위치 메뉴 ===========");
			System.out.println(sarr[0].getNo() + ". " + sarr[0].getName());
			System.out.println(sarr[1].getNo() + ". " + sarr[1].getName());
			System.out.println(sarr[2].getNo() + ". " + sarr[2].getName());
			System.out.println(sarr[3].getNo() + ". " + sarr[3].getName());
			System.out.println(sarr[4].getNo() + ". " + sarr[4].getName());
			System.out.println("9. 메인메뉴로 돌아가기");
			System.out.println("================================");
			System.out.print("샌드위치를 선택하세요 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 : sandwich.printRecipe(sarr[0]); break;
			case 2 : sandwich.printRecipe(sarr[1]); break;
			case 3 : sandwich.printRecipe(sarr[2]); break;
			case 4 : sandwich.printRecipe(sarr[3]); break;
			case 5 : sandwich.printRecipe(sarr[4]); break;
			case 9 : System.out.println("메인 메뉴로 돌아갑니다."); return;
			default : System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요."); break;
			}

			boolean yn = order.isChoose(); //샌드위치 주문 확정?

			if(yn) { //확정할거임
				selectSandwich = sarr[no - 1].getName(); //그러면 최종 샌드위치 초기화
				if(order.drinkOrder()) { //음료주문도 할거임
					drinkMenu();
					break; //음료메뉴창으로
				} else {
					return; //초기메뉴로
				}
			}
		}
	}

	public void drinkMenu() {

		while(true) {
			System.out.println("============ 음료 메뉴 ============");
			System.out.println("1. " + darr[0]);
			System.out.println("2. " + darr[1]);
			System.out.println("3. " + darr[2]);
			System.out.println("4. " + darr[3]);
			System.out.println("5. " + darr[4]);
			System.out.println("9. 메인메뉴로 돌아가기");
			System.out.println("================================");
			System.out.print("음료를 선택하세요 : ");
			int no = sc.nextInt();

			switch(no) {
			case 1 : System.out.println(darr[0] + "을 선택하셨습니다."); break;
			case 2 : System.out.println(darr[1] + "을 선택하셨습니다."); break;
			case 3 : System.out.println(darr[2] + "을 선택하셨습니다."); break;
			case 4 : System.out.println(darr[3] + "을 선택하셨습니다."); break;
			case 5 : System.out.println(darr[4] + "을 선택하셨습니다."); break;
			case 9 : System.out.println("메인 메뉴로 돌아갑니다."); return;
			default : System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요."); break;
			}
			
			boolean yn = order.isChoose(); // 결정함?
			
			if(yn) { // 결정하면
				selectDrink = darr[no - 1]; //음료최종선택
				return; //메인메뉴로
			} else { // 선택취소
				continue;
			}

		}
	}

	public void showOrder() {

		if (selectSandwich == null && selectDrink == null) {
			System.out.println("선택하신 메뉴는 없습니다.");
		} else {
			System.out.println("선택하신 메뉴는 " + selectSandwich + "샌드위치 " + selectDrink + "입니다.");
		}
		return;
	}

}
