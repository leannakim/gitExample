package ch10;

public class StaticMethod2 {
	//멤버변수
	static int num=10; //사번
	static String name="홍길동";
	String email="hong@gmail.com";
	String hp="010-1234-5678";
	String addr="서울 강남구 역삼동";
	
	public static void printA() {
		
		System.out.println("사번 :"+num);
		System.out.println("이름 : "+name);
		StaticMethod2 e = new StaticMethod2();
		System.out.println("이메일: " +e.email);
		StaticMethod2 hp = new StaticMethod2();
		System.out.println("전화번호 : " +hp.hp);
		StaticMethod2 ad = new StaticMethod2();
		System.out.println("주소 : " + ad.addr);
	}
	public void printB() {
		
		System.out.println("사번 :"+num);
		System.out.println("이름 : "+name);
		System.out.println("이메일: " +email);
		System.out.println("전화번호 : " +hp);
		System.out.println("주소 : " + addr);
	}
			
	public static void main(String[] args) {
		System.out.println("=======printA========");
		printA();
		System.out.println("=======printB========");
		StaticMethod2 s = new StaticMethod2();
		s.printB();
	}

}
