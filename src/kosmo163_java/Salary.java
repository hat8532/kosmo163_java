package kosmo163_java;

public class Salary {
	
	public void test(int [] nums) {
		nums = new int[2];
		nums[0] = 9;
	}
	
	//급여계산  
	//건강보험 0.03 고용보험 0.02 국민연금 0.01 산재 0.01
	//메서드 이름 make
	public void make(int s, boolean check) {
		System.out.println("급여 계산");
		
		if(check) {
		double t1 = s*0.03;
		double t2 = s*0.02;
		double t3 = s*0.01;
		double t4 = s*0.01;
		double result = s-t1-t2-t3-t4;
		System.out.println("실 급여: "+ result);
		}else {
			double result = s - s*0.033;
			System.out.println("실 급여: "+ result);
		}
	}
}
