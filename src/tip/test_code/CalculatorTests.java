package tip.test_code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

	private Calculator calc; 												//필드값 공유 안함

	@BeforeAll 																//하나의 인스턴스를 모두 공유할 때
	public static void beforeAll() {
		System.out.println("beforeAll 동작함...");
	}

	@BeforeEach 															//각 테스트 자원 세팅
	public void setUp() {
		calc = new Calculator();
		System.out.println("beforeEach 동작함...");
	}

	@Test 																	//순서 보장 안함
	public void 더하기기능_10과_20을_전달하여_잘_더해지는지_확인() { 					//테스트용은 한글도 가능

		int result = calc.sumTwoNumbers(10, 20);

		System.out.println("테스트1");

		assertEquals(30, result);
	}

	@Test																	//주석처리하면 꺼짐
	@Disabled																//테스트 건너뛰기
	@DisplayName("SumTwoNumber에 30과 50을 전달하여 잘 더해지는지 확인")
	public void testSumTwoNumber2() { 										//테스트는 void로, 메소드명은 중복불가

		int result2 = calc.sumTwoNumbers(30, 50);

		System.out.println("테스트2");

		assertEquals(80, result2); 											//단정메소드
		//		assertTrue();
		//		assertNotNull();
		//		assertNull();

		//given
		int num1 = 30;
		int num2 = 50;
		int expected = 80;

		//when
		int result = calc.sumTwoNumbers(num1, num2);

		//then
		assertEquals(expected, result);										//테스트코딩 작성 흐름
	}

	@AfterEach 																//각 테스트 자원 반납
	public void close() {
		System.out.println("afterEach 동작함...");
	}

	@AfterAll 																//하나의 인스턴스를 모두 공유할 때
	public static void afterAll() {
		System.out.println("afterAll 동작함...");
	}

}
