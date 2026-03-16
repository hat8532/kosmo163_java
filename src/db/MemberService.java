package db;

public class MemberService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "1234";
		String pw = "5678";
		String name = "홍길동";
		Member member = new Member();
		member.id=id;
		member.pw=pw;
		member.name=name;
		
		MemberDAO dao = new MemberDAO();
		dao.addMember(member);
	}

}
