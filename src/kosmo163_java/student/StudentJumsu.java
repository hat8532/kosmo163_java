package kosmo163_java.student;

public class StudentJumsu {
	
	public void t(Student st) {
		st.total = st.kor + st.eng + st.math;
		st.avg = st.total/3.0;
	}
	
	public void t2(Student st) {
		st = new Student();
		st.total=90;
		st.avg=30.0;
	}
}