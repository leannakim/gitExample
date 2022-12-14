package ch12;

public class LocalOuter2 {
	private int data =20;
	void display() {//LocalOuter2의 멤버메소드
		class Localinner2{//지역내부클래스
			int value =50;
			void msg() {
				System.out.println(value);
				System.out.println(data);
			}
		}//end inner class
		Localinner2 li = new Localinner2();
		li.msg();
		
	}//end method
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
		
	}
}
