package ch10;

public class Ch3 extends Pa3 {
	String email="hong@gmail.com";
	String hp="010-1234-5678";
	
	@Override
	public void print() {
		super.print();
		System.out.println("이메일 : "+email);
		System.out.println("전화번호 : "+hp);
	}

}
