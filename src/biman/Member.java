package biman;

public class Member {
	private String name;
	private int age;
	private double weight;
	private double height;

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

//	public String getName() {			// 게터메서드
//		return this.name;
//	}
//	
//	public void setAge(int age) {		// 세터메서드
//		if((age<0)&&(age>150)) {
//			System.err.println("나이는 0세 이상 150세 이하로 입력해주세요.");
//			
//		}
//		this.age =age;
//	}
	
	
	
	
	
	
	
	
	
	
	
}