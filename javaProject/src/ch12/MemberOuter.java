package ch12;

public class MemberOuter {
	private int num=1;
	private String name = "홍길동";
	private String email = "hong@gmail.com";
	class Inner{
		void v() {
			System.out.println("---------------------------");
			System.out.println("고객번호 : " + num);
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + email);
			System.out.println("---------------------------");
		}
	}
	public static void main(String[] args) {
		MemberOuter ob = new MemberOuter();
		MemberOuter.Inner in = ob.new Inner();
		in.v();
	}
}
