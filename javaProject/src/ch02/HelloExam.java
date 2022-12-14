package ch02;
//클래스 이름은 대문자로 시작
public class HelloExam {
	//전역변수(멤버변수)는 메소드와 클래스 사이에 선언됨
	/*
	 * 슬래시 별표 엔터키 하면 여러줄 주석
	 */
	//메소드 이름은 소문자로 시작
	public static int sum(int n, int m) {//n=20, m=10
		return n+m;//30
	}
	public static int sum2(int n, int m) {//n=20, m=10
			return n/m;//30
	}
	//실행되는 메인 메소드(=함수)
	public static void main (String[]args) {
		//메소드안에서 선언된 변수(지역변수)
		int i = 20; //지역변수 초기화(값을 저장, 변수에 할당한다.)
		int s;//지역변수 선언
		char a;//지역변수 선언 
		
		s = sum(i, 10); //s=30
		double s2 = sum2(30,10);
		a = '?';//단 문자는 작은 따옴표(''), 문자는 큰 따옴표("")를 쓴다.
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(s2);
	}
}
