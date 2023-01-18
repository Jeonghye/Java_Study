package team.question.sandwichkiosk;

public class SandwichDTO {
	
	private int no;
	private String name;
	private String bread;
	private String ingredient;
	private String veg;
	private String sauce;
	
	public SandwichDTO(int no, String name, String bread, String ingredient, String veg, String sauce) {
		super();
		this.no = no;
		this.name = name;
		this.bread = bread;
		this.ingredient = ingredient;
		this.veg = veg;
		this.sauce = sauce;
	}
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getBread() {
		return bread;
	}

	public String getIngredient() {
		return ingredient;
	}

	public String getVeg() {
		return veg;
	}

	public String getSauce() {
		return sauce;
	}
	
	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public void setVeg(String veg) {
		this.veg = veg;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	

}
