package kosmo163_java.ex1;
import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine ma = new Marine();
		ma.name = "Marine";
		ma.price = 50;
		ma.damage = 10;
		ma.hp = 50;
		
		System.out.println(ma.name);
		System.out.println(ma.price);
		System.out.println(ma.damage);
		System.out.println(ma.hp);
		
		System.out.println("1.공격 2.이동");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==1) {
			ma.attack();
		}else {
		ma.move();
		}
	}

}