package ch13;

public class Obj {//extends Object 기본적으로 자동으로 형성되어 있다.
	public static void main(String[] args) {
		Obj e1 = new Obj();
		System.out.println(e1.getClass());//클래스의 정보
		System.out.println(e1);
		System.out.println(e1.toString());//Object를 문자열로 변환
		
	}
	
}
