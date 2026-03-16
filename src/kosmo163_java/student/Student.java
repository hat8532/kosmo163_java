package kosmo163_java.student;

public class Student {
	// 변수 (instance 변수 멤버변수 field)
	// 접근 지정자 [그외지정자] 데이터타입 변수명
	String name;
	int kor; 
	int math; 
	int eng;
	int total;
	double avg;
	
	
	// 메서드 (intance method, 멤버매서드)
	// public  static   void    main(String[] args){}
	// 접근지정자 [그외지정자] 리턴타입  메서드명([매개변수들 선언]){}
	public void info() {
		System.out.println("info");
	}
	
	public static void print() {
		System.out.println("print");
	}
	
	
}