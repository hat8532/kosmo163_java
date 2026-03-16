package kosmo163_java.student;

public class StudentView {
	//view 
	//학생의 정보를 출력
	//이름, 국어, 영어, 수학, 총점, 평균
	public void view(Student st) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(st.name+"\t"+st.kor+"\t"+st.eng+"\t"+st.math+"\t"+st.total+"\t"+st.avg);
	}
}
