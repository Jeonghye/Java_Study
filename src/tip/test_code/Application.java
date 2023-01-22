package tip.test_code;

public class Application {

	public static void main(String[] args) {

		/* TDD : 먼저 실패하게끔 테스트 - 역추적 */
		
		Calculator calc = new Calculator();
		int result = calc.sumTwoNumbers(10, 20);
		if(result == 30) {
			System.out.println("테스트 성공");
		} else {
			System.out.println("테스트 실패");
		}
		
		int result2 = calc.sumTwoNumbers(20, 30);
		if(result2 == 50) {
			System.out.println("테스트 성공");
		} else {
			System.out.println("테스트 실패");
		}
		
	}

}
