package code_review.practice.chap05_array.array.level04_advanced;

import java.util.Scanner;

public class Baseball {

	char[] game = new char[4];
	char[] answer = new char[4];
	int count = 10;

	public void randomMaker() {

		for(int i = 0; i < game.length; i++) {
			int num = (int) (Math.random() * 10) + 48;
			if(isRepeated(game, num)) {
				continue;
			} else {
				game[i] = (char) num;
			}
		}
		
		for(int i = 0; i < game.length; i++) {
			System.out.print(game[i]);
		}

	}
	
	public boolean isRepeated(char game[], int num) {
		boolean repeat = false;
		for(int i = 0; i < game.length; i++) {
			if(num == game[i]) {
				repeat = true;
			}
		}
		return repeat;
	}
	
	public void getAnswer() {
		
		for(int i = 0; i < game.length; i++) {
		}
		
	}

	public void scan() {
		
		for(;;) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("정답 : ");
			String num = sc.nextLine();

			for(int i = 0; i < num.length(); i++) {
				
				if(num.length() != 4) {
					System.out.println("4자리의 정수를 입력해야 합니다.");
					break;
				} else {
					
				}
			}
			
		}
		

		
	}
	
	public void indexNum() {
		
		
	}
	






}
