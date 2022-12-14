package ch12;

class Outer{
	class InstanceInner{//내부클래스
		int a = 100;//non-static
	}
	static class StaticInner{//static 클래스
		int a =200;//non-static
		static int b = 300;//static
	}
	void myMethod() {//Outer의 멤버메소드
		class LocalInner{//지역중첩클래스
			int a = 400;//non-static
		}//end inner class
		LocalInner i = new LocalInner();
		System.out.println("i.a : "+ i.a);
	}//end method
}
public class InnerEx4 {

	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i = oc.new InstanceInner();
		
		System.out.println("i.a :" +i.a);
		System.out.println("Outer.StaticInner.b : "+ Outer.StaticInner.b );
		
		//non-static 멤버는 static 클래스 안에 있더라고 반드시 new를 통해 생성한 후 사용해야한다.
		//non-static 일경우 생성자를 만든 후 접근해야 출력이 가능하다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a : "+ si.a);
		
		oc.myMethod();
	}

}
