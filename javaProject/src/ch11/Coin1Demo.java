package ch11;

public class Coin1Demo {

	public static void main(String[] args) {//스태틱은 new를 쓰지않고 이름 해서 접근가능하다.
		//인터페이스의 상수는 static 영역에 있기떄문에 클래스이름.상수이름 으로 접근이 가능하다.
		System.out.println("Dime은 "+ Coin.DIME + "센트입니다.");
	}

}
