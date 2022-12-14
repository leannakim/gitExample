package ch10;
//static => 메모리에 바로 로딩
//nonstatic => 반드시!! 객체생성 후 로딩가능
public class A {
	//멤버변수==초기화 안해도 된다.
	String name = "kim";//String=null/int=0,duoble=0.0으로 초기화값이 설정되어있다.
	                    //nonstatic member
	static int n = 20;//static member
	//멤버메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	public static void main(String[] args) {//static member
		//지역변수==초기화를 해야한다.
		int a =10;
		double b =20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		//System.out.println(name);//에러가 난다.
		
		A aa = new A();//nonstatic member는 반드시 객체생성(new) 후에 사용가능하다. 
		System.out.println(aa.name);
		
	}

}
