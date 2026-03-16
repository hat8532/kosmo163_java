package kosmo163_java.lang.ex1;
import java.util.Scanner;;

public class StringEx2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String fileName = sc.next();
		
		// 파일명 -> 이름.확장자
		// 이미지파일인지 체크 jpg, png, gif, jpeg
		//   abc.png,      test.pdf		 	hello.PNG
		// 이미지파일 입니다  이미지파일이 아닙니다    이미지 파일입니다
		// 1.   .의 index 번호   2.   .이후의 문자열 꺼내오기     3.    이미지 파일 체크
		
		//1. .의 인덱스
		int index = fileName.lastIndexOf(".");
		System.out.println(index);
		
		//2. 문자열 꺼내기
		String name = fileName.substring(index+1);
		System.out.println(name);
		
		//3. 이미지 파일 체크
		String[] files = {"jpg","gif","png","jpeg"};
		String result = "이미지 파일이 아닙니다.";
		for(int i=0;i<files.length;i++) {
			result = "이미지입니다";
			break;
		}
		System.out.println(result);
		if(name.equalsIgnoreCase("png")) {
			System.out.println("이미지다");
		}else if(name.equalsIgnoreCase("gif")) {
			System.out.println("이미지다");
		}else if(name.equalsIgnoreCase("jpg")) {
			System.out.println("이미지다");
		}else if(name.equalsIgnoreCase("jpeg")) {
			System.out.println("이미지다");
		}else {
			System.out.println("이미지가 아니다");
		}
	}
}
