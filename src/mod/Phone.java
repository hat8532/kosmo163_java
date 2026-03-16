package mod;

public class Phone {
	public static String company;
	//fianl 사용시 변수명은 전부 대문자
	final String PHONE_Name;
	int price;
	
	{
		this.PHONE_Name = "아이폰";
		System.out.println("인스턴스 초기화 블럭 : "+this.PHONE_Name);
	}
	
	//에러나는 이유 final로 선언한 변수는 변경하지 않는다. 상수처럼 사용해라
	public Phone() {
		this.PHONE_Name = "123";
	}
	
	// 클래스 변수 초기화 미리 값을 넣거나 스태틱 초기화인 Instance블럭 사용
	// public static String company = "삼성";
	//인스턴스 블럭
	static{
		Phone.company = "애플";
	}
	
	public void call() {
		System.out.println(Phone.company);
		System.out.println(this.name);
		Phone.info();
	}
	
	public static void info() {
		System.out.println(Phone.company);
		//에러나는 이유 스태틱이 선언되면 먼저 생성되서
		System.out.println(this.name);
		System.out.println(this.price);
	}
}
