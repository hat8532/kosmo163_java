package kosmo163_java.student;
import java.util.Scanner;

public class StudentController {

	// start
	public void start(Student st) {
		Scanner sc = new Scanner(System.in);
		Studentinput si = new Studentinput();
		StudentJumsu sj = new StudentJumsu();
		StudentView sv = new StudentView();
		
		//1.학생 정보 입력
		//	학생 정보 입력 후 총점과 평균이 계산
		//2.학생 정보 출력
		//	학생 정보 출력
		//3.프로그램 종료
		while(true) {
			System.out.println("\n메뉴를 선택해주세요\n1.학생 정보 입력\n2.학생 정보 출력\n3.프로그램 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("학생 정보를 입력합니다");
				si.input(st);
				sj.t(st);
			}
			else if(select==2) {
				System.out.println("학생 정보를 출력합니다");
				sv.view(st);
			}
			else {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
}
