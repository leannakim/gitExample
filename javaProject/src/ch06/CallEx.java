package ch06;

public class CallEx {

	private static void test(int b) {//변수의 이름은 상관없고 데어터 타입과 갯수는 상관한다.
		                             //순서는 상관이 없으나 메인메소드가 제일먼저 순서대로 출력하게 된다.
		System.out.println("test method호출");
		System.out.println(b);
		
		
	}
	public static void main(String[] args) {
		System.out.println("시작");
		int a = 10;
		test(a);//a는 call by value형식으로 호출, 메소드 호출
		
		test2(a);
		System.out.println("끝");
	}//프로그램 끝

	private static void test2(int a) {
		System.out.println(a);
	}


}
