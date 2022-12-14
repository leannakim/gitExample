package ch12;

public class StaticOuter {
	static int x = 10;
	static class Inner{//static inner class
		int getx() {
			return x;
		}
	}
	public static void main(String[] args) {
		//new 외부클래스, 내부클래스 생성자
		StaticOuter.Inner in =new StaticOuter.Inner();//내부Static클래스 생성
		System.out.println(in.getx());
	}
}
