package kosmo163_java.lang.ex2;

import java.util.Scanner;

public class WrapperService {


//	public void juminCheck(Scanner sc) {
//		System.out.println("주민번호를 입력: xxxxxx-xxxxxxx");
//		String data = sc.next();
//		int num = 2;
//		int sum = 0;
//		for(int i=0; i<data.length()-1;i++) {
//			String s = data.substring(i, i+1);
//			if(s.equals("-")) {
//				continue;
//			}
//			int c = Integer.parseInt(s);
//			sum = sum+c*num;
//			num++;
//			if(num>9) {
//				num=2;
//			}
//		}	
//		System.out.println(sum);
//		sum = sum%11;
//		sum = 11-sum;
//		if(sum>9) {
//			sum=sum%10;
//		}
//		
//		int check = Integer.parseInt(data.substring(data.length()-1));
//		if(sum==check) {
//			System.out.println("올바른 번호다");
//		}else {
//			System.out.println("틀린번호다");
//		}

//	public void ageCount2(Scanner sc) {
//		System.out.println("주민번호를 입력: xxxxxx-xxxxxxx");
//		int year = 2026;
//		String data = sc.next();
//		//나이 계산
//		String[] ar = data.split("-");
//		int born = Integer.parseInt(ar[0].substring(0,2));
//		char mw = ar[1].charAt(0);
//		int last = 0;
//		// 1 2 인지 3 4인지 구분
//		if(mw=='1' || mw=='2') {
//			last = 1900 + born;
//		}
//		else if(mw=='3' || mw=='4') {
//			last = 2000 + born;
//		}
//		int age = year- last;
//		System.out.println("현재 나이는 "+ age + "세 입니다");
//	}

//	public void ageCount(Scanner sc) {
//		System.out.println("생년월일을 입력: xxxx-xx-xx");
//		String data = sc.next();
//		int year = 2026;
//		
//		String[] ar =data.split("-");
//		System.out.println(ar[0]);
//		
//		int age = Integer.parseInt(ar[0]);
//		year -= age;
//		System.out.println("현재 나이는 "+year+"세 입니다");

}