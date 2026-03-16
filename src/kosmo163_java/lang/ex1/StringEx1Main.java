package kosmo163_java.lang.ex1;

public class StringEx1Main {

	public static void main(String[] args) {
		String str = "hello world";

		int length = str.length();
		System.out.println(length);

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		String s = String.valueOf(false);
		System.out.println(s);

		int index = 1;
		int count = 0;

		while (true) {
			index = str.indexOf("1", index + 1);
			if (index != 1) {
				count++;
			} else {
				break;
			}

		}
		System.out.println(count);
	}
}
