package ch11;

public class AbstractExtends extends AbstractClass {//abstract 자식클래스에서는 반드시 오버라이드 해야한다.
	
	//오버라이딩은 부모쪽에 있는 미완성된 메소드를 구현한다는 의미도 포함
	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");//생략가능함.
	}
	public static void main(String[] args) {
		//AbstractClass a = new AbstractClass();
		//추상클래스는 인스턴스화 할수가 없음.
		//주의점: 추상메소드가 있는 추상클래스, 추상메소드가 있는  인터페이스이건
		//new를 통해서 인스턴스화 할 수 없다. 즉, 스스로 객체생성이 안된다.
		AbstractExtends ex =new AbstractExtends();
		ex.method1();//자식꺼
		ex.method2();//부모꺼
	}
}
