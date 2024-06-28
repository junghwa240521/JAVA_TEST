package member;

public class MemberInfo {

	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		Member member = new Member();
		
		public static void classMemberInfo() {
		member.setMemberId("junghwa");
		member.setMemberName("현정화");
		member.setMemberEmail("gmjunghwa@gmaiol.com");
		member.setMemberGender("여성");
		member.setMemberPhone("010-1234-5678");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberEmail());
		System.out.println(member.getMemberGender());
		System.out.println(member.getMemberPhone());
		
		member.setMemberId("junghwa45464456");
		System.out.println(member.getMemberId());


		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자
		//시즌 1
		Member mem1 = new Member("id_1", "이정재");
		Member mem2 = new Member("id_2", "박해수");
		Member mem3 = new Member("id_3", "홍길동");
		Member mem4 = new Member("id_4", "김혜수");
		Member mem5 = new Member("id_5", "갑돌이");

		System.out.println("회원1 ]" + mem1.getMemberId() + " :: " +mem1.getMemberName());
		System.out.println("회원2 ]" + mem2.getMemberId() + " :: " +mem2.getMemberName());
		System.out.println("회원3 ]" + mem3.getMemberId() + " :: " +mem3.getMemberName());
		System.out.println("회원4 ]" + mem4.getMemberId() + " :: " +mem4.getMemberName());
		System.out.println("회원5 ]" + mem5.getMemberId() + " :: " +mem5.getMemberName());
		
		//드라마 오징어게임 시즌1 출연자 정보 호출
		MemberDrama.Memberinfo();
		
		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)

		}
	}

}