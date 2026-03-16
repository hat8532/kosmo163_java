package kosmo163_java;
import java.util.Scanner;
public class SalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//멤버를 사용하려면 객체를 먼저 생성
		//변수선언  객체 생성
		//클래스는 데이터타입이다
		Scanner sc = new Scanner(System.in);
		Salary sa = new Salary();
		
		//멤버 사용
		//멤버변수 사용
		//참조변수명.멤버변수명
		//멤버메서드 사용
		//참조변수명.멤버메서드
		System.out.println("급여를 입력하세요");
		int a = sc.nextInt();
		sa.make(a, true);
		System.out.println("세전 급여 :"+ a);
		
		int[] nums = {1,2,3};
		
		sa.test(nums);
		System.out.println(nums[0]); 
	}
}