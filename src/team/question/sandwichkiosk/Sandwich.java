package team.question.sandwichkiosk;

import java.util.Scanner;

public class Sandwich {
	
	Scanner sc = new Scanner(System.in);
	
	public SandwichDTO[] setSandwich() {
		
		SandwichDTO[] sarr = new SandwichDTO[5];
		sarr[0] = new SandwichDTO(1, "로스트치킨", "플랫브레드", "닭가슴살", "양상추", "칠리");
		sarr[1] = new SandwichDTO(2, "비엘티", "허니오트", "베이컨", "양상추", "랜치");
		sarr[2] = new SandwichDTO(3, "에그마요", "위트", "계란", "양상추", "마요네즈");
		sarr[3] = new SandwichDTO(4, "참치", "하티", "참치", "양파", "마요네즈");
		sarr[4] = new SandwichDTO(5, "풀드포크", "플랫브레드", "바베큐", "양파", "바베큐");
		return sarr;
	}
	
	public void printRecipe(SandwichDTO sandwichDTO) {
		
		System.out.println("========== 샌드위치 레시피 ==========");
		System.out.println("빵 : " + sandwichDTO.getBread());
		System.out.println("메인 재료 : " + sandwichDTO.getIngredient());
		System.out.println("야채 : " + sandwichDTO.getVeg());
		System.out.println("소스 : " + sandwichDTO.getSauce());
		System.out.println("================================");
		
	}
	
}
