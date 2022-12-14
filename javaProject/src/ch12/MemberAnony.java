package ch12;

public class MemberAnony {
	public static void main(String[] args) {
		int num =2;
		String name = "김길동";
		String email = "kim@gmail.com";
		Member m = new Member() {

			@Override
			public void num() {
				System.out.println("고객번호 : " + num);				
			}

			@Override
			public void name() {
				System.out.println("이름 : " + name);				
			}

			@Override
			public void email() {
				System.out.println("이메일 : " + email);				
			}
			
		};
		System.out.println("---------------------------");
		m.num();
		m.name();
		m.email();
		System.out.println("---------------------------");
	}
}

