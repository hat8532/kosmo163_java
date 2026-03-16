package kosmo163_java.student;

public class School {
	public static void main(String[] args) {
//		Student st = new Student();
//		TestJumsu tj = new TestJumsu();
//		StudentView sv = new StudentView();
//		Studentinput ip = new Studentinput();
//		
//		ip.input(st);
//		tj.t(st);
//		sv.view(st);
		
		//StudentController start 메서드호출
		
		Student st = new Student();
		StudentController sc = new StudentController();
		
		sc.start(st);
		
		
		
		
		
		
		
		
	}
	
}