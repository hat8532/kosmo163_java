package kosmo163_java.lang;

public class WrapperMain1 {

	public static void main(String[] args) {
		String n = "123";
		Integer integer = new Integer(n);
		
		integer = Integer.valueOf(n);
		Long l = Long.valueOf(n);
		System.out.println(integer+1);
		
		// auto-boxing  
		int num = 3;
		integer = num;
		
		// auto=unboxing
		num = integer;
		
		long number = 3L;
		integer = (int)number;      // unboxing 은 같은 타입끼리 해야함
//		num = l;    // 원시타입과 레퍼런스 타입 구분
		
		// parsing
		num = Integer.parseInt("123A");
	}
}