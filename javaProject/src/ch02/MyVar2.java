package ch02;

public class MyVar2 {

	public static void main(String[] args) {
		String name = "홍길동";
		String Email = "hong@gmail.com";
		String phonenum = "010-1234-5678";
	    String adress = "서울 강남구";
	    
	    String name1 = "이순신";
	    String Email1 = "lee@gmail.com";
	    String phonenum1 = "010-2345-7788";
	    String adress1 = "서울 송파구";
		
	    
		System.out.println("=================================================");
		System.out.println("이름  |" + "이메일             |" + " 전화            | " + "주소");
		System.out.println("-------------------------------------------------");
		System.out.println(name + "|" + Email + "|" + phonenum + "|" + adress);
		System.out.println(name1+ "|" + Email1 + "|" + phonenum1 + "|" + adress1);
		System.out.println("------------------------------------------------");
		System.out.println("=================================================");
	}
}

