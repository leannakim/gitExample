package ch10;

class T{
	private int num=10;
	public final void print() {//메소드에서 final을 하면 오버라이딩이 안된다.
		System.out.println(num);
	}
}




public class FinalMethod2 extends T{
	int num=100;
	//@Override//final이 되어 있으면 만들수가 없다.
	//public void print() {
	//	super.print();
	//}
	public static void main(String[] args) {
		//상속관계가 만들어 졌을 때 자식클래스를 객체생성하면 부모클래스는 자동 생성된다.
		FinalMethod2 f = new FinalMethod2();
		f.print();
	}

}
