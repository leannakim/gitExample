package ch10;

public class StaticVar {
	static int a=10;
	int b=20;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(StaticVar.a);//클래스 이름.static member변수
		//System.out.println(b);//객체생성을 하지 않아서 에러남.
		StaticVar s = new StaticVar();
		System.out.println(s.b);//항상 논스테틱은 new를 사용객체생성 후 사용해야한다.
	}

}
