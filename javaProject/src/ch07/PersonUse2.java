package ch07;


public class PersonUse2 {

	public static void main(String[] args) {
		Person2 p2 = new Person2();
		p2.setName("홍길동");
		p2.setAge(30);
		p2.setEmail("hong@naver.com");
		p2.setAdress("서울 강남구 역삼동");
		
		p2.print();
		
		Person2 p3 = new Person2();
		System.out.println("======================");
		p3.setName("사임당");
		p3.setAge(25);
		p3.setEmail("saimdang@naver.com");
		p3.setAdress("서울 강남구 서초동");
		
		p3.print();
	}

}
