package daiso;

public class DaisoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyboard kb = new Keyboard();
		Mouse mo = new Mouse();
		Tv tv = new Tv();
		Notebook nb = new Notebook();
		
		Customer customer = new Customer();
		customer.money = 1000000;
		customer.point = 100;
	
		
		
		customer.buy(tv);
		System.out.println(tv);
		
		}

}
