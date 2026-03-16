package car;

public class Car {
	String company = "기아자동차";
	String model;
	int price;
	boolean manual; // true: 수동, false: 자동

	{
		System.out.println("인스턴스블럭:" + this.company);
		this.company = "현대자동차";
	}

	public Car() {
		this("그렌져");
		System.out.println("기본생성자 호출");
	}

	public Car(String m) {
		this("제네시스", 50000000);
	}

	public Car(String model, int price) {
		this(model, price, false);
	}

	public Car(String model, int price, boolean manual) {
		System.out.println("생성자 :" + this.company);
		this.company = "르노자동차";
		this.model = model;
		this.price = price;
		this.manual = manual;
	}
	

	//메서드 헤더, { }메서드 바디
	public void info() {
		int num = 0;
		System.out.println("제조사: " + this.company);
		System.out.println("모델명: " + this.model);
		System.out.println("가격: " + this.price);
		System.out.println("수동 여부: " + this.manual);
	}
}
