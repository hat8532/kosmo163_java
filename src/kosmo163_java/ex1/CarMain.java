package kosmo163_java.ex1;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_ex myCar = new Car_ex();
		myCar.model = "아반떼";
		myCar.speed =100;
		myCar.color = "White";
		
		Car_ex friendCar = new Car_ex();
		friendCar.model = "제네시스";
		friendCar.speed =150;
		friendCar.color = "Black";
		
		myCar = friendCar;
		myCar.color = "Red";
		System.out.println(myCar.model);
		System.out.println(myCar.color);
	}
//예상 제네시스 red
}