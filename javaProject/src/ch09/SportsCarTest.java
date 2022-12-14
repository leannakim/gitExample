package ch09;

public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar obj = new SportsCar();//자식클래스만 인스턴스화(객체생성)
		obj.speed = 10;//speed는 car라는 부모클래스 멤버변수
		//SportsCar 객체는 car객체를 상속받았기 때문에 부모격인 car객체의 멤버들(멤버변수, 멤버메소드)를
		//모두 사용할 수 있다.
		//부모꺼는 내꺼
		obj.setSpeed(60);
		obj.setTurbo(true);
		
	}

}
