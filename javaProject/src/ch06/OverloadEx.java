package ch06;

public class OverloadEx {

	public static void main(String[] args) {//메소드 이름은 같으나 매개변수의 갯수나 변수의 타입은 달라야한다.
		print(10.5);
		print("hello");
		print(100);
		print("Hi","Java");
		
	}

	static void print(double a) {
		System.out.println(a);
		
	}
	static void print(String b) {
		System.out.println(b);
	}
	static void print(int c) {
		System.out.println(c);
	}
	/*static String print(int i) {//리턴 타입과 오버로딩은 무관하다.//에러가 난다.
		System.out.println(i);
	}*/
	
	 static void print(String a, String b) {
		 System.out.println(a);
		 System.out.println(b);
	}



}
