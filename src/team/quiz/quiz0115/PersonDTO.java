package team.quiz.quiz0115;

public class PersonDTO {
	
	private String name;
	private int age;
	private char gender;
	private double height;
	
	public PersonDTO(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void print() {
		if(this.age >= 20) {
			System.out.println(this.name + "은 합벅적으로 술을 구매할 수 있습니다.");
		} else {
			System.out.println("당신은 미성년자 입니다.");
		}
	}

}
