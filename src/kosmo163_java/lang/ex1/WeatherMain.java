package kosmo163_java.lang.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherMaker wm = new WeatherMaker();
		WeatherDTO[] ar = wm.init();
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i].getCityName());
		}
	}
}